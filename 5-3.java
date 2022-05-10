import java.io.*;
import java.util.Scanner;

public class Main {

    public static String ReadFile(String fileName) throws Exception {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            return bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            throw new Exception("Файл не існує!");
        } catch (IOException e) {
            throw new Exception("Помилка: " + e.getMessage());
        }
    }

    public static void WriteFile(String fileName, String line) throws Exception {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(line + " ");
        } catch (IOException e) {
            throw new Exception("Помилка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            String line = ReadFile("input.txt");
            String[] words = line.split(" ");

            String result = Integer.toString(words.length);
            WriteFile("output.txt", result);

            System.out.println("Результат записано");



        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
