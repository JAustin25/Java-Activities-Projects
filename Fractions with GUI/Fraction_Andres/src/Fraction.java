
/**
 * The Fraction Class
 * Contains all the calculations of the Fraction class
 */

public class Fraction {

    //Data Members
    public int num; //Holds the numerator of the fraction
    public int den; //Hold the denominator of the fraction

    /**
     * Constructs a fraction with numerator = 0 and denominator = 1
     * This constructor allows a fraction with an equivalent numeric value of zero to
     * be created... This becomes the default constructor (since it has no arguments)
     * Example of usage: Fraction frac = new Fraction();
     */

    public Fraction(){this.num = 0; this.den = 1;}

    /**
     * Method in storing the finalized numerator and denominator
     * @param num numerator
     * @param den denominator
     */

    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
    }

    /**
     * Method in storing the numerator
     * @return the numerator
     */

    public int getNum(){return num;}
    public void setNum(int num){this.num = num;}
    public int getDen(){return den;}
    public void setDen(int den){this.den = den;}

    /**
     * Method in storing the denominator
     * @return the denominator
     */



    private int calculateGCD(int numerator, int denominator){
        if(numerator % denominator == 0){return denominator;}
        return calculateGCD(denominator, numerator % denominator);
    }

    /**
     * Method in calculating for the simplified version of the added, subtracted, multiplied, divided Fraction
     * @return the simplified version of the fraction
     */

    public Fraction reduce(){
        int gcd = calculateGCD(num, den);
        num /= gcd;
        den /= gcd;
        return new Fraction(num, den);
    }

    /**
     * Method in adding the finalized Fraction 1 and 2
     * @param frac is the fractions to be added
     * @return the added fraction from the user finalized Fraction 1 and 2
     */

    public Fraction addFraction(Fraction frac){
        int num = (this.num * frac.getDen()) + (frac.getNum() * den);
        int den = this.den * frac.getDen();
        return new Fraction(num, den);
    }

    /**
     * Method in subtracting the finalized Fraction 1 and 2
     * @param frac is the fractions to be subtracted
     * @return the subtracted fraction from the finalized Fraction 1 and 2
     */

    public Fraction subtractFraction(Fraction frac){
        int num = (this.num * frac.getDen()) - (frac.getNum() * den);
        int den = this.den * frac.getDen();

        return new Fraction(num, den);
    }

    /**
     * Method in multiplying the finalized Fraction 1 and 2
     * @param frac is the fractions to be multiplied
     * @return the multiplied fraction from the finalized Fraction 1 and 2
     */

    public Fraction multiplyFraction(Fraction frac){
        int num = this.num * frac.num;
        int den = this.den * frac.den;
        return new Fraction(num, den);
    }

    /**
     * Method in dividing the finalized Fraction 1 and 2
     * @param frac is the fractions to be divided
     * @return the divided fraction from the finalized Fraction 1 and 2
     */

    public Fraction divideFraction(Fraction frac){
        int num = this.num * frac.getDen();
        int den = this.den * frac.num;
        return new Fraction(num, den);
    }

    /**
     * Method in retrieving the menu available for executing
     * @return the menu available for executing
     */

    public String getMenu(){
        System.out.println("-===============================-");
        System.out.println("-= 1. Add Fractions");
        System.out.println("-= 2. Subtract Fractions");
        System.out.println("-= 3. Multiply Fractions");
        System.out.println("-= 4. Divide Fractions");
        System.out.println("-= 5. Exit Program");
        System.out.println("-===============================-");
        System.out.print("-= Choice: ");
        return " ";
    }

    /**
     * Method in converting the numbers to String to form the fraction
     * @return the String of the form fraction
     */

    public String toString(){return this.num + "/" + this.den;}
}
