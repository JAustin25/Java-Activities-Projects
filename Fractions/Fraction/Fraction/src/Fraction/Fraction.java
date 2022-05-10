package Fraction;

public class Fraction {


    int denominator;
    int numerator;

    public Fraction() {
        this.numerator =1;
        this.denominator =0;
    }
    public Fraction(int num, int den){
        numerator = num;
        denominator = den;
    }
    public Fraction(int wholeNumVal){


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
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public int ComputeGCD(int numerator, int denominator) {
        if (numerator % denominator == 0) {
            return denominator;
        }
        return ComputeGCD(denominator, numerator % denominator);
    }
    public void reduce(){
        int gcd = ComputeGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
    public Fraction add(Fraction f) {

        int numerator = (this.numerator * f.getDenominator())+(f.getNumerator()*denominator);
        int denominator = this.denominator * f.getDenominator();
        return new Fraction(numerator, denominator);
    }
    public Fraction sub(Fraction f){
        int numerator = (this.numerator * f.getDenominator())-(f.getNumerator()*denominator);
        int denominator = this.denominator*f.getDenominator();
        return new Fraction(numerator,denominator);
    }
    public Fraction mul(Fraction f){
        int numerator = (this.numerator*f.getNumerator());
        int denominator = (this.denominator*f.getDenominator());
        return new Fraction(numerator, denominator);
    }
    public Fraction div (Fraction f){
        int numerator = (this.getNumerator()*f.getDenominator());
        int denominator = (this.getDenominator()*f.getNumerator());
        return new Fraction (numerator, denominator);
    }
}


