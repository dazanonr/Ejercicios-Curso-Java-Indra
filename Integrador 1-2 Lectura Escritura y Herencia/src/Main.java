import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner("C:\\Users\\dazanonr\\Documents\\INFO_VUELOS.txt");

            File file = new File("C:\\Users\\dazanonr\\Documents\\Vuelos.txt");
            BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter(file, true));
            if (sc.hasNextLine()) {sc.nextLine();} //Saltarse la cabecera}
            VuelosIberia vuelosIberia = new VuelosIberia();

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] datosVuelo = linea.split(";");

                if (datosVuelo.length >= 5) {
                    vuelosIberia.setNombre(datosVuelo[0]);
                    vuelosIberia.setPasajeros(Integer.parseInt(datosVuelo[1]));
                    vuelosIberia.setTipo(datosVuelo[2]);
                    vuelosIberia.setValorUnitario(Integer.parseInt(datosVuelo[3]));
                    vuelosIberia.setFecha(datosVuelo[4]);
                    vuelosIberia.calcularValorFinal();
                    vuelosIberia.calcularSegmentation();

                    bufferedWriter.newLine();
                    bufferedWriter.write(vuelosIberia.toString());

                } else {
                    System.out.println("Error: Datos incompletos en la línea: " + linea);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}