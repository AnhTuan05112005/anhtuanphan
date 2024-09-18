package ss1_introduction_to_java.baitap;
import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello: " + name);
    }
}
