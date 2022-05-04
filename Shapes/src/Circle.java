
public class Circle extends Shape {
    private double rad;

    /**
     * Constructs the shape: Circle

     */
    public Circle(String name, double r){
        super(name);
        this.rad = r;
    }

    /**
     * Returns the area of the circle
     * @return the area
     */
    public double area(){
        return Math.PI * Math.pow(rad, 2);
    }

    /**
     * Returns the perimeter of the circle
     * @return the perimeter
     */
    @Override
    public double perimeter(){
        return 2 * Math.PI * rad;
    }

    /**
     * test
     * @return
     */
    public String toString() {
        return getName() + " with a circular side";
    }
}
