package main.java.dazanonr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

/*
Desarrollar un programa que se conecte a la api de https://pokeapi.co/
 en la misma debe elegir un Pokemon (el que usted prefiera)
 e informar lo siguiente de el:

- Nombre (species: name)
- Tipo de pokemon que es (type)
- Peso (weight)
Una vez obtenida esa información imprimirla en un TXT, a su vez,
compilar el proyecto de tipo Maven.
*/
public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://pokeapi.co/api/v2/pokemon/infernape");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();

            StringBuilder stringBuilder = new StringBuilder();
            Scanner sc = new Scanner (url.openStream());
            while(sc.hasNext())
            {
                stringBuilder.append(sc.nextLine());
            }

            JSONObject pokemonData = new JSONObject(stringBuilder.toString());

            //Se extrae la especie
            JSONObject species = pokemonData.getJSONObject("species");
            //Y de la especie, el nombre
            String name = species.getString("name");

            //Sacamos el peso, similar a lo anterior
            int weight = pokemonData.getInt("weight");

            //Se extrae el JSONArray de "types"
            JSONArray types = pokemonData.getJSONArray("types");
            //Dentro de "types" accedemos a los dos objetos
            JSONObject type1 = types.getJSONObject(0);
            JSONObject type2 = types.getJSONObject(1);
            //Otro mas
            type1 = type1.getJSONObject("type");
            type2 = type2.getJSONObject("type");
            //Dentro están los nombres de los tipos
            String typeName1 = type1.getString("name");
            String typeName2 = type2.getString("name");

            System.out.println("Nombre: "+ name + ", Tipos: " + typeName1 + " y " + typeName2 + ", Peso :" + weight);

            File file = new File("C:\\Users\\dazanonr\\Documents\\Pokemon");
            file.mkdirs();

            file = new File("C:\\Users\\dazanonr\\Documents\\Pokemon\\pokemon.txt");

            //BufferedWriter depende del FileWriter
            BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter(file));

            bufferedWriter.write("Nombre: "+ name + ", Tipos: " + typeName1 + " y " + typeName2 + ", Peso :" + weight);


            bufferedWriter.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}