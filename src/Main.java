import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //Приглашение и прием входных значений с клавиатуры
        System.out.println("Введите арифметическую операцию с двумя операндами:");
        Scanner sc = new Scanner(System.in);
        //Вызов метода calc и вывод результата в консоль
        System.out.println(calc(sc.nextLine()));
    }

    public static String calc(String input) throws IOException {
        //Проверка вводных данных
        if (input.length() >= 3) {
            //Удаляем из вводной строки пробелы, оставляем только цифры и знак оператора
            input = input.replaceAll("[^0-9A-Z+\\-*/]", "");

            //Помещаем входные данные в массив, отсеивая элементы через пробел
            String[] values = input.split("[+\\-*/]");
            String op = extractOp(input);
            //Проверка на правильность расположения оператора (между операндами)
            if (op.matches("([+\\-*/])")) {
                if ((values[0].matches("[A-Z]++") && values[1].matches("[0-9]++")) || (values[0].matches("[0-9]++") && values[1].matches("[A-Z]++")))
                    throw new IOException("Не совпадают системы счистления у операндов");

                //Проверка являются ли входные операнды римскими цифрами и, если да, превращение их в арабские
                if (values[0].matches("[A-Z]++") && values[1].matches("[A-Z]++")) {
                    return Roman.calculate(values, op);
                } else return Arabic.calculate(values, op);

            } else throw new IOException("Недопустимая операция");
        } else throw new IOException("Недопустимая операция");
    }

    //Метод для извлечения оператора из строки входных данных
    static String extractOp(String input) {
        if (input.contains("+")) return "+";
        else if (input.contains("-")) return "-";
        else if (input.contains("*")) return "*";
        else if (input.contains("/")) return "/";
        else return null;
    }
}