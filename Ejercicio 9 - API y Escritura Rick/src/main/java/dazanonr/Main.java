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

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://rickandmortyapi.com/api/character");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();

            StringBuilder stringBuilder = new StringBuilder();
            Scanner sc = new Scanner (url.openStream());
            while(sc.hasNext())
            {
                stringBuilder.append(sc.nextLine());
            }

            JSONObject characterData = new JSONObject(stringBuilder.toString());
            JSONArray characterJSONArray = characterData.getJSONArray("results");

            File file = new File("C:\\Users\\dazanonr\\Documents\\Rick");
            file.mkdirs();
            file = new File("C:\\Users\\dazanonr\\Documents\\Rick\\personajes_RickAndMorty.txt");
            BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter(file));

            JSONObject character = new JSONObject();
            JSONObject characterLocation = new JSONObject();
            for (int i=0; i< characterJSONArray.length(); i++){
                character = characterJSONArray.getJSONObject(i);
                /*
                - Nombre
                - Status
                -  Species
                - Gender
                - Location
                */
                bufferedWriter.write(character.getString("name"));
                bufferedWriter.newLine();
                bufferedWriter.write(character.getString("status"));
                bufferedWriter.newLine();
                bufferedWriter.write(character.getString("species"));
                bufferedWriter.newLine();
                bufferedWriter.write(character.getString("gender"));
                bufferedWriter.newLine();
                bufferedWriter.write(character.getJSONObject("location").getString("name"));
                bufferedWriter.newLine();
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}