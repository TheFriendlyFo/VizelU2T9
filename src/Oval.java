import java.util.HashMap;

public class Oval {
    public static HashMap<Integer, Oval> ovals = new HashMap<>();
    private double len;
    private double wid;
    private int id;

    // Creates an oval object and stores it in the ovals hashmap with its 'id' value as its key
    public Oval(double len, double wid, int id) {
        this.len = len;
        this.wid = wid;
        this.id = id;
        ovals.put(id, this);
    }

    public static Oval get(int id) {return ovals.get(id);}

    // Returns the area of the oval with given specs
    public double area() { return len/2 * wid/2 * Math.PI; }


    // Returns the circumference of the oval with given specs
    public double circumference() { return Math.PI * (wid + len); }


    // Setter methods to update len and wid:
    public void setLen(double newLen) { len = newLen;}
    public void setWid(double newWid) { wid = newWid;}


    // Returns a String that includes info about the circle:
    public String getInfo() {
        return String.format("Oval ID %s:\n", id) +
                String.format("Length: %s\n", len) +
                String.format("Width: %s\n", wid) +
                String.format("Area: %s\n", area()) +
                String.format("Circumference: %s\n", circumference());

    }
}