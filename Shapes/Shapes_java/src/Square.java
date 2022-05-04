
public class Square extends Shape{
    protected double side;

    /**
     * Constructs the shape: Square
     */
    public Square(String name, double side){
        super(name);
        sides = 4;
        this.side = side;
    }

    /**
     * @return the area of the square
     */
    public double area(){
        return side * side;
    }

    public double getSide(){
        return side;
    }

    /**
     * @return the perimeter of the square
     */
    @Override
    public double perimeter() {
        return 4 * side;
    }
}
