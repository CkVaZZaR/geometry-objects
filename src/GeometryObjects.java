public abstract class GeometryObjects implements Comparable<GeometryObjects> {
    double square;
    double scale;
    double a;

    public GeometryObjects(double a) {
        this.a = a;
        this.square = getSquare();
    }

    public void setScale(double scale) {
        this.scale = scale;
        getScale();
    }

    public abstract void getScale();

    public abstract double getSquare();

    @Override
    public int compareTo(GeometryObjects o) {
        if (this.square > o.square) {
            return 1;
        } else if (this.square < o.square) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "GeometryObjects{" +
                "square=" + square +
                '}';
    }
}
