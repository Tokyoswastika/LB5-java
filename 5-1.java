import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void Output(String[] arr)
    {
        if(arr.length == 0) {
            System.out.println("Масив пустий");
            return;
        }

        for (String val: arr)
            System.out.println(val);
    }

    public static String[] Task1(String[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].toLowerCase(Locale.ROOT);
        }

        return arr;
    }
    public static void Task2(String[] arr)
    {
        for (String val: arr) {
            if (val.length() % 2 == 0)
                System.out.println(val);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть рядок:");

        String str = in.nextLine();
        String[] words = str.split(" ");

        System.out.println("Рядок:");
        Output(words);

        System.out.println("Замінює всі великі літери, що входять до тексту на відповідні малі:");
        Output(Task1(words));

        System.out.println("Всі слова, що мають парну кількість літер:");
        Task2(words);

    }
}
