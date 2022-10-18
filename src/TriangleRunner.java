public class TriangleRunner {
    public static void main(String[] args) {
        RightTriangle r1 = new RightTriangle(3, 4);
        RightTriangle r2 = new RightTriangle(6.5, 10.7);
        RightTriangle r3 = new RightTriangle(0, 2);

        double hyp1 = r1.hyp();
        double hyp2 = r2.hyp();
        double hyp3 = r3.hyp();

        System.out.println(hyp1);
        System.out.println(hyp2);
        System.out.println(hyp3);
    }
}
