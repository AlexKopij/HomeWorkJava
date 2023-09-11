import java.util.Scanner;

public class HomeWork1 {

    public static void task_3(){
        Scanner iScanner = new Scanner(System.in);
        int a = iScanner.nextInt();
        String sim = iScanner.next();
        int b = iScanner.nextInt();
        int result = switch (sim) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.print("= ");
        System.out.print(result);
    }
    


    public static int getInt(String st) {
        Scanner scan = new Scanner(st);
        scan.useDelimiter("\\D+");
        if (st.indexOf("?") == st.length() - 1) {
            return 10 * scan.nextInt();
        } else {
            return scan.nextInt();
        }
    }

    public static void main(String[] args) {
        String word;
        Scanner iScanner = new Scanner(System.in);
        word = iScanner.nextLine();
        word = word.replace(" ", "");
        String[] arr = word.split("[+=]");

        int a = getInt(arr[0]);
        int b = getInt(arr[1]);
        int c = getInt(arr[2]);

        if (a > b && a > 10) {
            a = a + b;
            b = c - a;
        } else if (b > a && b > 10) {
            b = a + b;
            a = c - b;
        }
        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
        } else {
            System.out.println("False");
        }
    }
}