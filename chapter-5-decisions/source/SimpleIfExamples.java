/*
 * This program demonstrates various uses of the if statement.
 */

public class SimpleIfExamples {

    public static void main(String[] args) {
        int age = 20;

        // Standalone if statement
        if (age < 21) {
            System.out.println("You can't buy alcohol.");
        }
        System.out.println("Keep that in mind when you go to the store!");

        // if-else statement
        if (age < 21) {
            System.out.println("You can't buy alcohol.");
        } else {
            System.out.println("You can buy alcohol.");
        }

        // if-else-if structure
        if (age < 18) {
            System.out.println("You can't vote.");
        } else if (age < 21) {
            System.out.println("You can vote, but you can't buy alcohol.");
        } else {
            System.out.println("You can vote and buy alcohol.");
        }

        // Series of if-statements
        if (age < 18) {
            System.out.println("You can't vote.");
        }
        if (age >= 18) {
            System.out.println("You can vote.");
        }
        if (age < 21) {
            System.out.println("You can't buy alcohol.");
        }
        if (age >= 21) {
            System.out.println("You can buy alcohol.");
        }

    }

}
