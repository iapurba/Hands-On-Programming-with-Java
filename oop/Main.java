public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("first number = " + calculator.getFirstNumber());
        System.out.println("second number = " + calculator.getSecondNumber());
    }
}
