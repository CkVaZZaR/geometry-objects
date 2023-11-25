public class Triangle extends GeometryObjects {
    double b, c;

    public Triangle(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
        this.square = getSquare();
    }

    @Override
    public void getScale() {
        this.a *= this.scale;
        this.b *= this.scale;
        this.c *= this.scale;
        this.square = getSquare();
    }

    @Override
    public double getSquare() {
        double p = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
}
