public class BadOverloading {
    public static void main(String[] args) {
        System.out.println(area(15, 10)); // <.>
    }

    // Calculates area of a rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Calculates area of an oval
    public static double area(double smallRadius,
            double bigRadius) {
        double area = 3.14 * smallRadius * bigRadius;
        return area;
    }

}