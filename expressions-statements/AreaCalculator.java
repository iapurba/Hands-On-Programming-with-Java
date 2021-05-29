public class AreaCalculator {
    // Area of a circle
    public static double area(double radius) {
        if (radius <= -1.0) {
            return -1.0;
        }
        return radius * radius * Math.PI;
    }
    // Area of a rectangle
    public static double area(double x, double y) {
        if (x <= -1.0 || y<= -1.0) {
            return -1.0;
        }
        return x * y;
    }
}
