package Fraction;

public class Fraction {
    int numerator;
    int denominator;



    public Fraction() {
        int n = 0;
        int d = 0;
        numerator = n;
        denominator = d;
        reduce();
        
    }

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int numerator) {
        this.denominator = denominator;
    }
    public int GCD(int numerator, int denominator) {
        if (numerator % denominator == 0) {
            return denominator;
        }
    return GCD(denominator, numerator % denominator);
    }
    void reduce(){
        int gcd = GCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
}





