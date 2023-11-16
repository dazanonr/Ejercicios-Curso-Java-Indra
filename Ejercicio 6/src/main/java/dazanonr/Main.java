package main.java.dazanonr;
import org.json.JSONObject;
import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {
        String input;
        Scanner scanner = new Scanner(System.in);
        JSONObject comida = new JSONObject();

        System.out.println("Ingrediente 1: ");
        input = scanner.next();
        comida.put("ingrediente1",input);

        System.out.println("Ingrediente 2: ");
        input = scanner.next();
        comida.put("ingrediente2",input);

        System.out.println("Ingrediente 3: ");
        input = scanner.next();
        comida.put("ingrediente3",input);

        System.out.println("Ingrediente 4: ");
        input = scanner.next();
        comida.put("ingrediente4",input);

        System.out.println("Ingrediente 5: ");
        input = scanner.next();
        comida.put("ingrediente5",input);

        System.out.println("Tiempo de cocción: ");
        input = scanner.next();
        comida.put("tiempoCoccion",input);

        System.out.println("Bebida : ");
        input = scanner.next();
        comida.put("bebida",input);

        System.out.println(comida.toString());
        System.out.println("Comida :\n" +
                "\nIngrediente 1: " + comida.get("ingrediente1") +
                "\nIngrediente 2: " + comida.get("ingrediente2") +
                "\nIngrediente 3: " + comida.get("ingrediente3") +
                "\nIngrediente 4: " + comida.get("ingrediente4") +
                "\nIngrediente 5: " + comida.get("ingrediente5") +
                "\nTiempo de cocción: " + comida.get("tiempoCoccion") +
                "\nBebida para acompañarBebida para acompañar: "+ comida.get("bebida"));
    }
}