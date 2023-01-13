import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        skill("Driving");
        scan.close();
    }

    static void skill(String drive) {

        System.out.println("Driving School");
        taste(drive);

        String feedback = getFeedBack(drive);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            practiceSkill(drive);

            // Recursive call
            skill(drive);
        } else if (feedback.equals("yes")) {
            serve(drive);
        }
    }

    static void taste(String drive) {
        System.out.println("Taking Driving Skill Test");
    }

    static String getFeedBack(String drive) {
        System.out.println("Did I pass the " + drive + " skill test? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void practiceSkill(String drive) {
        System.out.print("Do you want to retake your driving lesson?:");
        String ingredient = scan.next();
        System.out.println("Retaking driving lesson ");
    }

    static void serve(String drive) {
        System.out.println("You can now start " + drive);
    }
}
