public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {

        if (width < 0) {
            width = 0;
            return;
        }

        if (length < 0) {
            length = 0;
            return;
        }
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }
}
