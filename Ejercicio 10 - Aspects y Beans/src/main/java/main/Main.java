package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import configuration.AspectConfig;
import function.Function;
import java.util.Scanner;

public class Main {

    public static void main (String [] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        Function function = context.getBean(Function.class);

        System.out.println("Bienvenido. Puede introducir dos números " +
                "sobre los que quiere ver la suma, resta, multiplicación y división ");
        System.out.println("Primer número: ");

        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        System.out.println("Segundo número: ");
        int secondInput = sc.nextInt();

        System.out.println("Primer número: " + firstInput + "\n");
        System.out.println("Segundo número: " + secondInput + "\n");

        System.out.println("Prueba con datos introducidos:");
        function.add(firstInput,secondInput);
        function.substract(firstInput,secondInput);
        function.multiply(firstInput,secondInput);
        function.divide(firstInput,secondInput);

        System.out.println("Prueba con datos pesados de prueba:");
        firstInput = 2834290;
        secondInput = 12391293;
        function.add(firstInput,secondInput);
        function.substract(firstInput,secondInput);
        function.multiply(firstInput,secondInput);
        function.divide(firstInput,secondInput);

        context.close();
    }
}