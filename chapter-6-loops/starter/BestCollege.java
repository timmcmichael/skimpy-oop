
/*
 * Starter code for video demonstration of while and do-while loops.
 * 
 * Prompts user to input the name of the best community college, repeating until they get it right.
 */
import java.util.Scanner;

public class BestCollege {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String BEST_COMMUNITY_COLLEGE = "EMCC";
        String userResponse = "";

        System.out.print("What is the best community college? ");
        userResponse = input.nextLine();

        while (!userResponse.equalsIgnoreCase(BEST_COMMUNITY_COLLEGE)) {
            System.out.print("Wrong, try again! What is the best community college? ");
            userResponse = input.nextLine();
        }

        System.out.println("That's right!");
    }

}
