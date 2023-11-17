package main.java.dazanonr;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main extends JFrame{

    public static void main(String[] args) throws IOException {
            /*- Barcelona
            - Madrid
            - Berlin
            - Buenos Aires*/

        JFrame ventana = new JFrame("Meteo");
        JPanel panel = new JPanel();
        JButton barcelonaButton = new JButton("Barcelona");
        JButton madridButton = new JButton("Madrid");
        JButton berlinButton = new JButton("Berlin");
        JButton buenosAiresButton = new JButton("Buenos Aires");

        //Ponemos la imagen inicial y los componentes en la ventana
        ImageIcon icono = new ImageIcon();
        JLabel etiquetaImagen = new JLabel(icono, JLabel.CENTER);
        JLabel etiquetaTexto = new JLabel();
        panel.add(etiquetaImagen);
        panel.add(etiquetaTexto);
        panel.add(barcelonaButton);
        panel.add(madridButton);
        panel.add(berlinButton);
        panel.add(buenosAiresButton);
        ventana.add(panel);
        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        barcelonaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    URL cityURL = new URL("https://api.open-meteo.com/v1/forecast?latitude=41.3888&longitude=2.159&hourly=temperature_2m");
                    HttpURLConnection httpURLCityConnection = (HttpURLConnection) cityURL.openConnection();
                    httpURLCityConnection.setRequestMethod("GET");
                    httpURLCityConnection.connect();
                    StringBuilder stringBuilder = new StringBuilder();

                    Scanner sc = new Scanner (cityURL.openStream());
                    while(sc.hasNext()) {stringBuilder.append(sc.nextLine()); }
                    JSONObject meteoData = new JSONObject(stringBuilder.toString());

                    etiquetaTexto.setText("Latitud: "+ meteoData.getBigDecimal("latitude")
                            +" Longitud: " + meteoData.getBigDecimal("longitude")
                            +" Huso horario:" + meteoData.getString("timezone")
                            +" Elevación: " + meteoData.getBigDecimal("elevation")
                            +" Temperatura: "
                            + meteoData.getJSONObject("hourly").getJSONArray("temperature_2m").get(0)
                    );


                    //Cambiamos a una nueva imagen
                    Image iconoNuevo = ImageIO.read(
                            new File("C:\\Users\\dazanonr\\Documents\\IntelliJ Projects\\Ejercicios Java Indra" +
                                    "\\Integrador-2\\images\\Barcelona.jpg"));
                    etiquetaImagen.setIcon(new ImageIcon(iconoNuevo));
                    //Actualizamos la ventana para que se vea el botón con la imagen
                    ventana.pack();
                } catch (MalformedURLException err) {
                    err.printStackTrace();
                } catch (IOException err) {
                    // TODO Auto-generated catch block
                    err.printStackTrace();
                }
            }
        });

        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    URL cityURL = new URL("https://api.open-meteo.com/v1/forecast?latitude=40.4165&longitude=-3.7026&hourly=temperature_2m");
                    HttpURLConnection httpURLCityConnection = (HttpURLConnection) cityURL.openConnection();
                    httpURLCityConnection.setRequestMethod("GET");
                    httpURLCityConnection.connect();
                    StringBuilder stringBuilder = new StringBuilder();

                    Scanner sc = new Scanner (cityURL.openStream());
                    while(sc.hasNext()) {stringBuilder.append(sc.nextLine()); }
                    JSONObject meteoData = new JSONObject(stringBuilder.toString());

                    etiquetaTexto.setText("Latitud: "+ meteoData.getBigDecimal("latitude")
                            +" Longitud: " + meteoData.getBigDecimal("longitude")
                            +" Huso horario:" + meteoData.getString("timezone")
                            +" Elevación: " + meteoData.getBigDecimal("elevation")
                            +" Temperatura: "
                            + meteoData.getJSONObject("hourly").getJSONArray("temperature_2m").get(0)
                    );


                    //Cambiamos a una nueva imagen
                    Image iconoNuevo = ImageIO.read(
                            new File("C:\\Users\\dazanonr\\Documents\\IntelliJ Projects\\Ejercicios Java Indra" +
                                    "\\Integrador-2\\images\\Madrid.jpg"));
                    etiquetaImagen.setIcon(new ImageIcon(iconoNuevo));
                    //Actualizamos la ventana para que se vea el botón con la imagen
                    ventana.pack();
                } catch (MalformedURLException err) {
                    err.printStackTrace();
                } catch (IOException err) {
                    // TODO Auto-generated catch block
                    err.printStackTrace();
                }
            }
        });
        berlinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    URL cityURL = new URL("https://api.open-meteo.com/v1/forecast?latitude=52.5244&longitude=13.4105&hourly=temperature_2m");
                    HttpURLConnection httpURLCityConnection = (HttpURLConnection) cityURL.openConnection();
                    httpURLCityConnection.setRequestMethod("GET");
                    httpURLCityConnection.connect();
                    StringBuilder stringBuilder = new StringBuilder();

                    Scanner sc = new Scanner (cityURL.openStream());
                    while(sc.hasNext()) {stringBuilder.append(sc.nextLine()); }
                    JSONObject meteoData = new JSONObject(stringBuilder.toString());

                    etiquetaTexto.setText("Latitud: "+ meteoData.getBigDecimal("latitude")
                            +" Longitud: " + meteoData.getBigDecimal("longitude")
                            +" Huso horario:" + meteoData.getString("timezone")
                            +" Elevación: " + meteoData.getBigDecimal("elevation")
                            +" Temperatura: "
                            + meteoData.getJSONObject("hourly").getJSONArray("temperature_2m").get(0)
                    );


                    //Cambiamos a una nueva imagen
                    Image iconoNuevo = ImageIO.read(
                            new File("C:\\Users\\dazanonr\\Documents\\IntelliJ Projects\\Ejercicios Java Indra" +
                                    "\\Integrador-2\\images\\Berlin.jpg"));
                    etiquetaImagen.setIcon(new ImageIcon(iconoNuevo));
                    //Actualizamos la ventana para que se vea el botón con la imagen
                    ventana.pack();
                } catch (MalformedURLException err) {
                    err.printStackTrace();
                } catch (IOException err) {
                    // TODO Auto-generated catch block
                    err.printStackTrace();
                }
            }
        });
        buenosAiresButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    URL cityURL = new URL("https://api.open-meteo.com/v1/forecast?latitude=-34.6131&longitude=-58.3772&hourly=temperature_2m");
                    HttpURLConnection httpURLCityConnection = (HttpURLConnection) cityURL.openConnection();
                    httpURLCityConnection.setRequestMethod("GET");
                    httpURLCityConnection.connect();
                    StringBuilder stringBuilder = new StringBuilder();

                    Scanner sc = new Scanner (cityURL.openStream());
                    while(sc.hasNext()) {stringBuilder.append(sc.nextLine()); }
                    JSONObject meteoData = new JSONObject(stringBuilder.toString());

                    etiquetaTexto.setText("Latitud: "+ meteoData.getBigDecimal("latitude")
                            +" Longitud: " + meteoData.getBigDecimal("longitude")
                            +" Huso horario:" + meteoData.getString("timezone")
                            +" Elevación: " + meteoData.getBigDecimal("elevation")
                            +" Temperatura: "
                            + meteoData.getJSONObject("hourly").getJSONArray("temperature_2m").get(0)
                    );


                    //Cambiamos a una nueva imagen
                    Image iconoNuevo = ImageIO.read(
                            new File("C:\\Users\\dazanonr\\Documents\\IntelliJ Projects\\Ejercicios Java Indra" +
                                    "\\Integrador-2\\images\\Buenos Aires.jpg"));
                    etiquetaImagen.setIcon(new ImageIcon(iconoNuevo));
                    //Actualizamos la ventana para que se vea el botón con la imagen
                    ventana.pack();
                } catch (MalformedURLException err) {
                    err.printStackTrace();
                } catch (IOException err) {
                    // TODO Auto-generated catch block
                    err.printStackTrace();
                }
            }
        });
    }
}