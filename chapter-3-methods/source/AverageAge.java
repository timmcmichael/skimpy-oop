public class AverageAge {
    public static void main(String[] args) {
        System.out.println(averageAge(1.25, 1.5, .5)); // <.>
        System.out.println(averageAge(10, 20)); // <.>
        System.out.println(averageAge(10, 20, 25)); // <.>
    }

    public static double averageAge(int age1, int age2) {
        return (double) (age1 + age2) / 2;
    }

    public static double averageAge(int age1, int age2, int age3) {
        return (double) (age1 + age2 + age3) / 3;
    }

    public static double averageAge(double age1, double age2, double age3) {
        return (double) (age1 + age2 + age3) / 3;
    }

}