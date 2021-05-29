public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }
    public String accelerate() {
        return getClass().getSimpleName() + " -> startEngine()";
    }
    public String brake() {
        return getClass().getSimpleName() + " -> startEngine()";
    }
    public String getName() {
        return this.name;
    }
    public int getCylinders() {
        return this.cylinders;
    }
}
