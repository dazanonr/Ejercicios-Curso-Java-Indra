import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido. Puede introducir dos números " +
                "sobre los que quiere ver la suma, resta, multiplicación y división ");
        System.out.println("Primer número: ");

        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        System.out.println("Segundo número: ");
        int secondInput = sc.nextInt();

        System.out.println("Primer número: " + firstInput + "\n");
        System.out.println("Segundo número: " + secondInput + "\n");

        int operation = firstInput + secondInput;
        System.out.println("Suma:" + operation);

        operation = firstInput-secondInput;
        System.out.println("Resta:" + operation);

        operation = firstInput*secondInput;
        System.out.println("Multiplicación:" + operation);

        if(secondInput == 0)
            System.out.println("No es posible dividir entre 0");
        else {
            operation = firstInput / secondInput;
            System.out.println("División:" + operation);
        }
    }
}