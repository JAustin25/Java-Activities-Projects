package ArithmeticFraction;
import Fraction.Fraction;
import java.util.Scanner;

class ArithmeticFraction{


    public static void main(String[] args) {


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the numerator ");
        scan1.nextInt();
        System.out.println("Enter the denominator ");
        scan1.nextInt();
        Inputs();


        ArithmeticFraction myProgram;
        try {
            myProgram = new ArithmeticFraction();
            myProgram.run();

        } catch (Exception x){
            System.out.println(x.getMessage());
        }
        System.exit(0);
    }
    static void Inputs(){
        Fraction f = new Fraction();

        Scanner scan = new Scanner(System.in);

        System.out.print("\nWhat do you want to do?\n ");

        System.out.println("1.Enter the value of Fraction 1: ");
        scan.nextInt();
        System.out.println("2.Enter the value of Fraction 2: ");
        scan.nextInt();


        System.out.println("3.Add Fractions");
        System.out.println("4.Subtract Fractions");
        System.out.println("5.Multiply Fractions");
        System.out.println("6.Divide Fractions");
        System.out.println("7.Reduce Fractions");
        {
            f.reduce();
        }

        System.out.println("8. Quit ");
        {
            System.exit(0);
        }

    }



    // more codes here...
    public void run(){
// to do codes
    }

} // end of FractionArithmetic class