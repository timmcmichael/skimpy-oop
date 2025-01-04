import java.util.Scanner;

public class InputDemoFinished {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        String email;

        System.out.println("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.nextLine();
        // age = age + 10;
        age += 10;
        System.out.print("Enter your age again: ");
        age = input.nextInt();
        input.nextLine();
        // age = age + 10;
        age += 10;

        System.out.print("Enter your email address: ");
        email = input.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("In 10 years, you will be " + age + " years old.");
        System.out.println("Email address = " + email);

    }

}
