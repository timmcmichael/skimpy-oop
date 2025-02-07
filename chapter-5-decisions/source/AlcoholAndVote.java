/*
 * This example demonstrates a nested if statement.
 * 
 * If the age is 21 or older, the program checks if the person is a citizen. If the person is a citizen, the program prints a message that the person can vote and buy alcohol. If the person is not a citizen, the program prints a message that the person can buy alcohol but can't vote. If the person is younger than 21, the program prints a message that the person can't vote or buy alcohol.
 * 
 */
public class AlcoholAndVote {
    public static void main(String[] args) {
        int age = 20;
        boolean isCitizen = true;
        if (age >= 21) {
            if (isCitizen) {
                System.out.println("You can vote and buy alcohol.");
            } else {
                System.out.println("You can buy alcohol, but you can't vote.");
            }
        } else {
            System.out.println("You can't vote or buy alcohol.");
        }
    }
}