package prototypes;

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
        int count = 0;
        int i = 0;

        // System.out.print("What is the best community college? ");
        // userResponse = input.nextLine();

        // while loop
        // while (!userResponse.equalsIgnoreCase(BEST_COMMUNITY_COLLEGE)) {
        //     System.out.print("Wrong, try again! What is the best community college? ");
        //     userResponse = input.nextLine();
        // }

        // do-while loop
        do {
            System.out.print("What is the best community college? ");
            userResponse = input.nextLine();
            count++;
            if (!userResponse.equalsIgnoreCase(BEST_COMMUNITY_COLLEGE)) {
                System.out.println("Wrong, try again! ");
            }
        } while (!userResponse.equalsIgnoreCase(BEST_COMMUNITY_COLLEGE));

        System.out.println("That's right! It took you " + count + " tries to get it right.");

        while (i < 10) {
            // i++;
            System.out.println("i = " + ++i);
        }
    }

}
