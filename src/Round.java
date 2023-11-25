public class Round extends GeometryObjects {

    public Round(double a) {
        super(a);
        this.square = getSquare();
    }

    @Override
    public void getScale() {
        this.a *= this.scale;
        this.square = getSquare();
    }



    @Override
    public double getSquare() {
        return a * a * Math.PI;
    }
}
