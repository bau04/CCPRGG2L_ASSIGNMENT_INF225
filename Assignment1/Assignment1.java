import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // Provide regex pattern
        Pattern pattern = Pattern.compile("[a-zA-z]+@students.national-u.edu.ph");

        Matcher match = pattern.matcher(email);

        boolean isValid = match.matches();

        if (isValid) {
            System.out.println("Valid email!");
        } else {
            System.out.println("Invalid email!");
        }
    }
}
