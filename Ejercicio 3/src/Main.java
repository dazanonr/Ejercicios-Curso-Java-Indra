import java.io.*;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            System.out.printf("Don't panic \n");
            new File("C:\\Users\\dazanonr\\Documents\\Test").mkdirs();
            String routeAndFile = "C:\\Users\\dazanonr\\Documents\\Test\\test.txt";

            File testArchive = new File(routeAndFile);
            testArchive.createNewFile();

            FileWriter fileWriter = new FileWriter(testArchive);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("This is not a test, relax and we'll do the rest");
            bufferedWriter.close();
            Scanner scanner = new Scanner(new File("C:\\Users\\dazanonr\\Documents\\Test\\test.txt"));
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            char[] text = new char[50];
            FileReader fileReader = new FileReader(testArchive);
            fileReader.read(text);
            for(char c : text)
                System.out.print(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}