import java.io.IOException;

public class Arabic {
    String[] values;
    String op;
    static String calculate(String[] operation, String op) throws IOException {

        //Помещаем первый и второй элементы массива в целочисленные переменные
        int a = Integer.parseInt(operation[0]);
        int b = Integer.parseInt(operation[1]);

        if (operation.length != 2) throw new IOException("Должно быть два операнда");
        //Проверка на требование 3
        if (a > 0 && a <= 10 && b > 0 && b <= 10) {
            //Получаем из второго элемента массива оператор и производим арифметическую операцию, результат преобразуем в строку и возвращаем
            return switch (op) {
                case "+" -> String.valueOf(a + b);
                case "-" -> String.valueOf(a - b);
                case "*" -> String.valueOf(a * b);
                case "/" -> String.valueOf(a / b);
                default -> throw new IOException("Неверный оператор");
            };
        } else throw new IOException("Один из операндов превысил допустимое значение");
    }
}