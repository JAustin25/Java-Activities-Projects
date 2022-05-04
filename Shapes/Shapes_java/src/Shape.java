

public abstract class Shape {
    public String name;
    protected int sides;

    public Shape(String n){
        name = n;
    }
    public String toString(){
        return name + " with " + sides + "sides.";
    }
    public int getSides(){
        return sides;
    }
    //declaration of the abstract
    public abstract double area();
    public abstract double perimeter();
    public String getName(){
        return name;
    }
}

