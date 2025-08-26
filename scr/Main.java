import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Entrada para el primer número
        System.out.println("----------------------------------------");
        System.out.print("Ingrese el primer número: ");
        int value1 = scanner.nextInt();
        System.out.print("Ingrese la base del primer número (2-10): ");
        int base1 = scanner.nextInt();
        NumberClass num1 = new NumberClass(value1, base1);

        // Entrada para el segundo número
        System.out.println("----------------------------------------");
        System.out.print("Ingrese el segundo número: ");
        int value2 = scanner.nextInt(); 
        System.out.print("Ingrese la base del segundo número (2-10): ");
        int base2 = scanner.nextInt();
        NumberClass num2 = new NumberClass(value2, base2);

        // Entrada para la operación
        System.out.println("----------------------------------------");
        System.out.print("Ingrese la operación (+, -, *, /): ");
        String operation = scanner.next();

        // Entrada para la base del resultado
        System.out.println("----------------------------------------");
        System.out.print("Ingrese la base para el resultado (2-10): ");
        int resultBase = scanner.nextInt();
        System.out.println("----------------------------------------");

        Operation op;
        switch (operation) {
            case "+" -> op = new Addition();
            case "-" -> op = new Substraction();
            case "*" -> op = new Multiplication();
            case "/" -> op = new Division();
            default -> {
                System.out.println("Operación inválida.");
                scanner.close();
                return;
            }
        }

        NumberClass result = op.operate(num1, num2, resultBase);
        System.out.println("Resultado: " + result);
        System.out.println("----------------------------------------");
        scanner.close();
    }
}
