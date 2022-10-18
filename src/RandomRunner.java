
public class RandomRunner {
    public static void main(String[] args) {
        char[] tiles = new char[]{'*','^','|','#','%','<','>','!','@','$'};

        for (int i=0; i<600; i++) {
            System.out.print(i%40 == 0 ? "\n" : "");
            System.out.print(tiles[((int) (Math.random() * 10))]);
        }
    }
}
