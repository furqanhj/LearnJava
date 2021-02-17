package NewLearnings;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        System.out.println("The name entered is: " + name());
    }

    static String name(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();

        scanner.close();

        return firstName + " " + lastName;
    }
}
