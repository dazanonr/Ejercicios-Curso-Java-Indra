import Ej2.Calculum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Bienvenido. Puede introducir tres números " +
                "sobre los que quiere ver el factorial, la raíz, y el valor absoluto\n");

        System.out.println("Primer número: ");
        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        System.out.println("Segundo número: ");
        int secondInput = sc.nextInt();
        System.out.println("Tercer número: ");
        int thirdInput = sc.nextInt();

        System.out.println("Primer número: " + firstInput + "\n");
        System.out.println("Segundo número: " + secondInput + "\n");
        System.out.println("Tercer número: " + thirdInput + "\n");

        Calculum firstCalculum = new Calculum(firstInput);

        System.out.println("Raíz primer número: " + firstCalculum.squareRoot());
        System.out.println("Factorial primer número: "+firstCalculum.factorial(firstInput));
        System.out.println("Valor Absoluto primer número: "+firstCalculum.absoluteValor());

        Calculum secondCalculum = new Calculum(secondInput);

        System.out.println("Raíz primer número: " + secondCalculum.squareRoot());
        System.out.println("Factorial primer número: "+secondCalculum.factorial(secondInput));
        System.out.println("Valor Absoluto primer número: "+secondCalculum.absoluteValor());

        Calculum thirdCalculum = new Calculum(thirdInput);

        System.out.println("Raíz primer número: " + thirdCalculum.squareRoot());
        System.out.println("Factorial primer número: "+thirdCalculum.factorial(thirdInput));
        System.out.println("Valor Absoluto primer número: "+thirdCalculum.absoluteValor());

    }
}