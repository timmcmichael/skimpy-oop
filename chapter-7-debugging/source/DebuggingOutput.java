public class DebuggingOutput {

    public static void main(String[] args) {
        int firstNum = 24;
        int secondNum = 10;

        System.out.println(firstNum); // <.>
        System.out.println(secondNum); // <.>

        int total = sum(firstNum, secondNum);
        System.out.println(total); // <.>

    }

    public static int sum(int num1, int num2) {
        System.out.println(num1 + ", " + num2 + " in method."); // <.>
        int result = -1;
        result = num1 - num2;
        System.out.println("Total = " + result + " in method."); // <.>
        return result;
    }

}