import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numEmpleados;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al gestor de empleados\n" +
                "Por favor introduczca el número de empleados a escribir: ");
        numEmpleados = Integer.parseInt(scanner.next());

        List<Empleado> empleados = new ArrayList<Empleado>();

        for(int i=0; i<numEmpleados ; i++){
            Empleado empleado = new Empleado();
            empleado.nuevoEmpleado();
            empleados.add(empleado);
        }

        try {
            File file = new File("C:\\Users\\dazanonr\\Documents\\Empleados");
            file.mkdirs();

            file = new File("C:\\Users\\dazanonr\\Documents\\Empleados\\informacion_nomina.txt");

            //BufferedWriter depende del FileWriter
            BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter(file, true));
            for (int i=0; i<numEmpleados; i++){
                bufferedWriter.newLine();
                bufferedWriter.write(empleados.get(i).toString());
            }

            bufferedWriter.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}