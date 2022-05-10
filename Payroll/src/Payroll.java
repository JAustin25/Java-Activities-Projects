
import java.util.Scanner;

public class Payroll {

    String b;
    Scanner scan = new Scanner(System.in);
    int choice;
    BufferedReader br = new BUfferedReader(new file("payinfo.txt"))

    public void main() {
        String a;
        Scanner scan2 = new Scanner(System.in);
        Payroll sa;
        sa = new Payroll();

        System.out.println("Welcome!");
        System.out.println("Please press Enter");
        a = scan2.nextLine();
        sa.options();


    }
    public void options() {

        System.out.println("\n=========================================================================\n");
        System.out.println("Please press Enter to view options.");
        b = scan.nextLine();
        System.out.println("1: Add an Employee");
        System.out.println("2: Search for Employees");
        System.out.println("3: Edit an employee information");
        System.out.println("4: Remove an employee information");
        System.out.println("5: Add employee payroll info.");
        System.out.println("6: Search for Payroll");
        System.out.println("7: Edit an Payroll Information");
        System.out.println("8: Remove an Payroll information");
        System.out.println("\n=========================================================================\n");

        choice = scan.nextInt();
        if (choice == 1) {
            AddE();
        }
    }

    private void AddE() {

    }

}

