import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Operation operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для начала работы калькулятора введите: Y." +
                " Для выхода из программы введите N");
        String start = scanner.next();
        while (start.equals("Y")) {
            System.out.println("Введите значение a:");
            double a = scanner.nextDouble();
            System.out.println("Введите знак операции(+,-,* или /):");
            String sign = scanner.next();
            switch (sign) {
                case "+" -> operation = new OperationPlus();
                case "-" -> operation = new OperationMinus();
                case "*" -> operation = new OperationMultiply();
                case "/" -> operation = new OperationDivision();
                default -> {
                    System.out.println("Вы ввели неверный знак, для ввода значений заного введите Y." +
                            "Для выхода из программы любой символ");
                    start = scanner.next();
                    continue;
                }
            }
            System.out.println("Введите значение b:");
            double b = scanner.nextDouble();

            operation.execute(a, b);
            System.out.println("Если хотите посчитать что-то еще введите Y." +
                    "Для выхода из программы введите любой символ");
            start = scanner.next();
        }
    }
}
