import java.util.Scanner;

public class inputdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("What is the rating from 1 to 5?");
        short rating = scanner.nextShort();  //it is better to add the scanner after the int is given for any cause
        scanner.nextLine();
        System.out.println("Enter your email");
        String email = scanner.nextLine();
        System.out.println("Hello " + name);
        System.out.println("You rated us " + rating);
        System.out.println("The email is " + email);
    }
}
