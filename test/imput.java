import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class imput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        // System.out.println("You entered: "+s);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("You entered: "+number);
        System.out.println("Enter a double: ");
        double dnumber = sc.nextDouble();
        System.out.println("You entered: "+dnumber);
        sc.close();
    }
}
