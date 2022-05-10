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

    public static void Reserve(String str) {
        for(int i = str.length()-1; i >= 0; i--)
        {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            String line = ReadFile("Zavd2.txt");
            String[] words = line.split(" ");

            if(words.length < 2) throw new Exception("Недостатньо інформації у файлі");

            int year = Integer.parseInt(words[1]);

            System.out.println("Прізвище: " + words[0]);
            System.out.println("Вік: " + year);
            System.out.println("Кількість літер у прізвищі: " + words[0].length());
            System.out.println("Прізвище у зворотному порядку в стовпець: ");
            Reserve(words[0]);

            String str = words[0] +" "+ (year + 10);
            WriteFile("Zavd2.txt", str);

            System.out.println("Вік збільшено на 10 та записано у файл.");



        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
