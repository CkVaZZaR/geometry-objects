public class Rectangle extends GeometryObjects {
    double b;
    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
        this.square = getSquare();
    }

    @Override
    public void getScale() {
        this.a *= this.scale;
        this.b *= this.scale;
        this.square = getSquare();
    }

    @Override
    public void setScale(double scale) {
        this.scale = scale;
        getScale();
    }

    @Override
    public double getSquare() {
        return this.a * this.b;
    }
}
