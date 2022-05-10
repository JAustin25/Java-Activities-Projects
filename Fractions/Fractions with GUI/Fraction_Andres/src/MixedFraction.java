

/**
 * The MixedFraction Class
 */

public class MixedFraction extends Fraction{

    /**
     * Method that holds the input for the Whole Number.
     */

    public int whole;

    /**
     * Method that stores the input for whole, numerator and denominator.
     * @param whole This is the whole number of the fraction.
     * @param numerator This is the numerator of the fraction.
     * @param denominator this is the denominator of the fraction.
     */

    MixedFraction(int whole, int numerator, int denominator){
        this.num = numerator;
        this.den = denominator;
        this.whole = whole;
    }

    /**
     *
     * @param whole This is the whole number of the fraction.
     * @param fraction Holds the numerator and denominator.
     */

    private MixedFraction(int whole, Fraction fraction){
        super(fraction.num, fraction.den);
        this.whole = whole;
    }

    /**
     * Method that can return the whole number.
     * @return The whole number.
     */

    private int getWhole(){return whole;}

    /**
     * Method in adding the user Inputted Fractions
     * @param mixedFraction This is the formed Mixed Fraction.
     * @return The added Mixed Fraction.
     */

    MixedFraction add(MixedFraction mixedFraction){
        num = this.whole*this.den +this.num;
        Fraction frac = super.addFraction(mixedFraction.setFractionPart());
        return toMixedFraction(frac);
    }

    /**
     * Method in subtracting the user Inputted Fractions
     * @param mixedFraction This is the formed Mixed Fraction.
     * @return The Subtracted Mixed Fraction.
     */

    MixedFraction subtract(MixedFraction mixedFraction){
        num = this.whole*this.den +this.num;
        Fraction frac = super.subtractFraction(mixedFraction.setFractionPart());
        return toMixedFraction(frac);
    }

    /**
     * Method in multiplying the user Inputted Fractions
     * @param mixedFraction This is the formed Mixed Fraction.
     * @return The Multiplied Mixed Fraction.
     */

    MixedFraction multiply(MixedFraction mixedFraction){
        num = this.whole*this.den +this.num;
        Fraction frac = super.multiplyFraction(mixedFraction.setFractionPart());
        return toMixedFraction(frac);
    }

    /**
     * Method in dividing the user Inputted Fractions
     * @param mixedFraction This is the formed Mixed Fraction.
     * @return The Divided Mixed Fraction.
     */

    MixedFraction divide(MixedFraction mixedFraction){
        num = this.whole*this.den +this.num;
        Fraction frac = super.divideFraction(mixedFraction.setFractionPart());
        return toMixedFraction(frac);
    }

    /**
     * Method in converting the Mixed Fraction to an improper Fraction
     * @return new Improper Fraction
     */

    Fraction setFractionPart(){
        int numerator = getWhole() * this.den + this.num;
        int denominator = this.den;
        return new Fraction(numerator, denominator);
    }

    /**
     * Method in converting the improper fraction to a Mixed Fraction
     * @param fraction This is the improper Fraction
     * @return new Mixed Fraction
     */

    private MixedFraction toMixedFraction(Fraction fraction){
        int whole = fraction.num / fraction.den;
        int denominator = fraction.den;
        int numerator = fraction.num % fraction.den;

        Fraction frac = new Fraction(numerator, denominator);
        return new MixedFraction(whole, frac);
    }

    /**
     * Method in compiling the user inputted numbers into a Mixed Fraction
     * @return String of Mixed Fraction
     */

    public String toString(){return this.whole + " " + super.toString();}
}
