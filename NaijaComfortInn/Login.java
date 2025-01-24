package NaijaComfortInn;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("""
                Welcome to the Naija Comfort Inn!

                Please select your role:

                1. Guest
                2. Staff

                Or type 'X' to exit
                """);
        String userInput = input.nextLine();

        switch(userInput.toUpperCase()) {
            case "1" -> {
                Guest guest = new Guest();
                guest.menu();
            }
            case "2" -> {
                Staff staff = new Staff();
                staff.authorise();
            }
            case "X" -> System.out.println("Goodbye");
            default -> {
                System.out.println("Invalid input. Try again.");
            }
        }
    }
}
