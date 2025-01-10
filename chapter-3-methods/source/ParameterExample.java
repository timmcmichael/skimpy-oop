public class ParameterExample {

    public static void main(String[] args) {
        printGreeting("Tim"); // <.>
    }

    public static void printGreeting(String name) { // <.>
        System.out.println("Hello, " + name + "!");
    }

}