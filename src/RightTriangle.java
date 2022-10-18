public class RightTriangle {

    private final double base;
    private final double height;

    RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hyp() {return Math.sqrt(Math.pow(base,2) + Math.pow(height,2));}
}
