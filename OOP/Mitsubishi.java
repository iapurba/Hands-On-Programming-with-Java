public class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }
    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}
