import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numProductos;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al gestor de productos\n" +
                "Por favor introduczca el número de productos a escribir: ");
        numProductos = Integer.parseInt(scanner.next());

        List<Producto> productos = new ArrayList<Producto>();

        for(int i=0; i<numProductos ; i++){
            Producto producto = new Producto();
            producto.nuevoProducto();
            productos.add(producto);
        }

        try {
            File file = new File("C:\\Users\\dazanonr\\Documents\\Productos");
            file.mkdirs();

            file = new File("C:\\Users\\dazanonr\\Documents\\Productos\\productos.txt");

            //BufferedWriter depende del FileWriter
            BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter(file, true));
            for (int i=0; i<numProductos; i++){
                bufferedWriter.newLine();
                bufferedWriter.write(productos.get(i).toString());
            }

            bufferedWriter.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}