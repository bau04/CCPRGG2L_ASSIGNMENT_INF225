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

// ----------------------------------------------------------------------------------------------------

        System.out.print("Enter cellphone number: ");
        String studentNum = sc.nextLine();

        Pattern pattern1 = Pattern.compile("^(09|\\+639)\\d{9}$");
        Matcher matcher = pattern1.matcher(studentNum);

        boolean match1 = matcher.matches();

        if (match1) {
            System.out.println("Valid cellphone number");
        } else {
            System.out.println("Invalid cellphone number");
        }
 
    }

}
