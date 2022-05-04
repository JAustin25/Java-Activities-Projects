
public class Rectangle extends Square {
    private double side2;

    /**
     * Constructs the shape: rectangle
     */
    public Rectangle(String name, double side1, double side2) {
        super(name, side1);
        sides = 4;
        this.side2 = side2;
    }

    /**
     * Returns the area of the rectangle
     * @return the area
     */
    public double area(){
        return side * side2;
    }

    /**
     * Returns the perimeter of the rectangle
     * @return the perimeter
     */
    @Override
    public double perimeter(){
        return 2 * (side + side2);
    }
}
