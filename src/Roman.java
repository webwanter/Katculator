import java.io.IOException;
import java.util.Objects;

public class Roman {
    String[] values;
    String op;

    static String calculate(String[] operation, String op) throws IOException {
        //Преобразование арабских цифр в римские с помощью метода transform класса Translation
        operation[0] = Translation.transform(operation[0]);
        operation[1] = Translation.transform(operation[1]);

        //Помещаем первый и второй элементы массива в целочисленные переменные
        int a = Integer.parseInt(operation[0]);
        int b = Integer.parseInt(operation[1]);
        //Проверка на требование 10
        if (Objects.equals(op, "-") && a <= b) throw new IOException("Не соблюдены условия выполнения операции с римскими цифрами");
        if (operation.length != 2) throw new IOException("Должно быть два операнда");
        //Проверка на требование 3
        if (a > 0 && a <= 10 && b > 0 && b <= 10) {
            //Получаем из второго элемента массива оператор и производим арифметическую операцию, результат преобразуем в строку и возвращаем
            return switch (op) {
                case "+" -> Translation.transform(String.valueOf(a + b));
                case "-" -> Translation.transform(String.valueOf(a - b));
                case "*" -> Translation.transform(String.valueOf(a * b));
                case "/" -> Translation.transform(String.valueOf(a / b));
                default -> throw new IOException("Неверный оператор");
            };
        } else throw new IOException("Один из операндов превысил допустимое значение");
    }
}