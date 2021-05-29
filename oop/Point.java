public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    // Find distance between this point and (0,0)
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    // Find distance between this point and point(x1, x2)
    public double distance(int x2, int y2) {
        return Math.sqrt(Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2));
    }
    // find distance between this point and the second point which is passed as a parameter;
    public double distance(Point second) {
        return Math.sqrt(Math.pow((this.x - second.x), 2)
            + Math.pow((this.y - second.y), 2));
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
