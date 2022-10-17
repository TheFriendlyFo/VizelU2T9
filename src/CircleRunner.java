public class CircleRunner {
    public static void main(String[] args) {
        new Oval(5,5, 0);
        System.out.println(Oval.get(0).getInfo());
        Oval.get(0).setLen(9.2);
        System.out.println(Oval.get(0).getInfo());

        new Oval(99.999, 0.1, 1);
        System.out.println(Oval.get(1).getInfo());

    }
}
