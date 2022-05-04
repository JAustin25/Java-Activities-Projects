
public class Triangle extends Shape{
    private double side1, side2, side3;

    /**
     * Constructs the shape: Triangle
     */
    public Triangle(String name, double s1, double s2, double s3){
        super(name);
        sides = 3;




        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    /**
     * Returns the area of the Triangle
     * @return heron
     */
    public double area(){
        double a = (side1 + side2 + side3) / 2;
        double heron = Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
        return heron;
    }

    /**
     * Returns the perimeter of the Triangle
     * @return
     */
    @Override
    public double perimeter() {
        double perimeter = 0;
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2 && side1 != 0 && side2 != 0 && side3 != 0){
            perimeter = side1 + side2 + side3;
        }
        return perimeter;
    }
}
