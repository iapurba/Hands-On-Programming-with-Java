public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0,0);
        System.out.println("Empty Constructor called.");
    }
    public Wall(double width, double height) {
        this.setHeight(height);
        this.setWidth(width);
    }
    public double getHeight() {
        return this.height;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }
    public double getArea() {
        return this.height * this.width;
    }
}
