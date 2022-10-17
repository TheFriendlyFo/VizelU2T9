import java.util.HashMap;

public class Circle {
    public static HashMap<Integer, Circle> circles = new HashMap<>();
    private double rad;

    public Oval(double rad) {
        this.rad = rad;
    }

    public static void addCircle (double rad) {circles.put(circles.size(), new Circle(rad));}
    public static Circle get(int id) {return circles.get(id);}

    /* Returns the area of the circle with given radius
       Area of a circle = pi * r ^ 2
       Use Math.PI for pi and use the pow method
     */
    public double area() { return Math.pow(rad,2) * Math.PI; }


    /* Returns the circumference of the circle with given radius
       Circumference of a circle = pi * 2 * r
       Use Math.PI for pi
     */
    public double circumference() { return Math.PI * 2 * rad; }


    /* Setter method to update the radius of the circle to newRadius
     */
    public void setRadius(double newRadius) { rad = newRadius; }


    /* Returns a String that includes info about the circle,
       including its radius, area, and circumference on separate lines;
       see example output below (Reminder: the new line escape
       sequence \n allows you to include new lines in Strings!)
       Note that this method should return a string -- it should NOT
       do any printing. This method should call your other methods!
     */
    public String getInfo() {
        return String.format("Circle ID %s:\n", id) +
                String.format("Radius: %s\n", rad) +
                String.format("Area: %s\n", area()) +
                String.format("Circumference: %s\n", circumference());

    }
}