
import javax.swing.*;
import java.awt.*;

public class Test extends JFrame{

    private JButton Circle;
    private JButton Square;
    private JButton Triangle;
    private JButton Rectangle;

    private JFrame frameCircle;
    private JFrame frameSquare;
    private JFrame mainFrame;

    private Shape s;

    /**
     * Main method that usually calls the other methods
     */
    public static void main(String[] args){
        Test program;
        try {
            program = new Test();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * The tester method which compiles the UI of the shapes.
     */
    public Test() throws Exception{
        mainFrame = new JFrame("Shapes");
        JPanel mainPanel = new JPanel();
        mainFrame.setBackground(Color.BLACK);
        mainPanel.setLayout(new GridLayout(4, 0));

        Circle = new JButton("Area of a Circle");
        Square = new JButton("Area of a Square");
        Triangle = new JButton("Area of a Triangle");
        Rectangle = new JButton("Area of a Rectangle");

        mainFrame.add(mainPanel);
        mainPanel.add(Circle);
        mainPanel.add(Square);
        mainPanel.add(Triangle);
        mainPanel.add(Rectangle);

        Circle.addActionListener((e)->{
            try{
                displayCircle();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });

        Square.addActionListener((e)->{
            try{
                displaySquare();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });

        Triangle.addActionListener((e)->{
            try{
                displayTriangle();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });

        Rectangle.addActionListener((e)->{
            try{
                displayRectangle();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });

        mainFrame.setSize(300,400);

        mainFrame.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Methods which Instants the Circle for Calculation
     */
    private void displayCircle(){
        frameCircle = new JFrame("Area of a Circle");
        frameCircle.setSize(400,100);
        frameCircle.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelCircle = new JPanel();
        panelCircle.setLayout(new GridLayout(2,2));
        JLabel inputRadiusLabel = new JLabel("Enter the radius: ");
        JButton calculateArea = new JButton("Calculate Area ");
        JTextField inputRadiusTextField = new JTextField(10);
        JTextField outputRadiusTextField = new JTextField(50);
        outputRadiusTextField.setEditable(false);

        calculateArea.addActionListener((e) ->{
            if(inputRadiusTextField.getText().equals("")){
                outputRadiusTextField.setText("Invalid Input");
            }
            else{
                double radius = Double.parseDouble(inputRadiusTextField.getText());
                s = new Circle("Circle", radius);
                if(s instanceof Circle){
                    outputRadiusTextField.setText("The area of " + ((Circle) s).toString() + " is " + ((Circle) s).area());
                }
                else{
                    outputRadiusTextField.setText("No instantiated Circle.");
                }
            }
        });

        panelCircle.add(inputRadiusLabel);
        panelCircle.add(inputRadiusTextField);
        panelCircle.add(calculateArea);
        panelCircle.add(outputRadiusTextField);

        frameCircle.add(panelCircle);
    }

    /**
     * Methods which Instants the Square for Calculation.
     */
    private void displaySquare(){
        frameSquare = new JFrame("Area of a Square");
        frameSquare.setSize(400,100);
        frameSquare.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSquare = new JPanel();
        panelSquare.setLayout(new GridLayout(2,2));
        JLabel inputLengthLabel = new JLabel("Enter the Length: ");
        JButton calculateArea = new JButton("Calculate the Area");
        JTextField inputLengthTextField = new JTextField(10);
        JTextField outputLengthTextField = new JTextField(50);
        outputLengthTextField.setEditable(false);

        calculateArea.addActionListener((e) ->{
            if(inputLengthTextField.getText().equals("")){
                outputLengthTextField.setText("Invalid Input");
            }
            else{
                double radius = Double.parseDouble(inputLengthTextField.getText());
                s = new Square("Square", radius);
                if(s instanceof Square){
                    outputLengthTextField.setText("The area of " + ((Square) s).toString() + " is " + ((Square) s).area());
                }
                else{
                    outputLengthTextField.setText("No instantiated Square.");
                }
            }
        });

        panelSquare.add(inputLengthLabel);
        panelSquare.add(inputLengthTextField);
        panelSquare.add(calculateArea);
        panelSquare.add(outputLengthTextField);

        frameSquare.add(panelSquare);
    }

    /**
     * Method which instants the Triangle for calculations
     */
    private void displayTriangle(){
        frameSquare = new JFrame("Area of a Triangle");
        frameSquare.setSize(400,100);
        frameSquare.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSquare = new JPanel();
        panelSquare.setLayout(new GridLayout(4,2));
        JLabel side1L = new JLabel("Enter the 1st Length: ");
        JLabel side2L = new JLabel("Enter the 2nd Length: ");
        JLabel side3L = new JLabel("Enter the 3rd Length: ");

        JButton calculateArea = new JButton("Calculate Area ");

        JTextField side1TF = new JTextField(10);
        JTextField side2TF = new JTextField(10);
        JTextField side3TF = new JTextField(10);

        JTextField outputLengthTextField = new JTextField(50);
        outputLengthTextField.setEditable(false);

        calculateArea.addActionListener((e) ->{
            if(side1TF.getText().equals("") || side2TF.getText().equals("") || side3TF.getText().equals("")){
                outputLengthTextField.setText("Invalid Input");
            }
            else{
                double length1 = Double.parseDouble(side1TF.getText());
                double length2 = Double.parseDouble(side2TF.getText());
                double length3 = Double.parseDouble(side3TF.getText());

                s = new Triangle("Triangle", length1, length2, length3);

                if(!(((length1 + length2) > length3) && ((length2 + length3) > length1) && ((length1 + length3 > length2)))){
                    outputLengthTextField.setText("Not a Valid Triangle");
                }
                else if(s instanceof Triangle){
                    outputLengthTextField.setText("The area of " + ((Triangle) s).toString() + " is " + ((Triangle) s).area());
                }
                else{
                    outputLengthTextField.setText("No instantiated Triangle.");
                }
            }
        });

        panelSquare.add(side1L);
        panelSquare.add(side1TF);
        panelSquare.add(side2L);
        panelSquare.add(side2TF);
        panelSquare.add(side3L);
        panelSquare.add(side3TF);
        panelSquare.add(calculateArea);
        panelSquare.add(outputLengthTextField);

        frameSquare.add(panelSquare);
    }

    /**
     * Method which instants the Rectangle for calculations
     */
    private void displayRectangle(){
        frameSquare = new JFrame("Area of a Rectangle");
        frameSquare.setSize(400,100);
        frameSquare.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelSquare = new JPanel();
        panelSquare.setLayout(new GridLayout(3,2));
        JLabel side1L = new JLabel("Enter the Length: ");
        JLabel side2L = new JLabel("Enter the Width: ");

        JButton calculateArea = new JButton("Calculate Area ");

        JTextField side1TF = new JTextField(10);
        JTextField side2TF = new JTextField(10);

        JTextField outputLengthTextField = new JTextField(50);
        outputLengthTextField.setEditable(false);

        calculateArea.addActionListener((e) ->{
            if(side1TF.getText().equals("") || side2TF.getText().equals("")){
                outputLengthTextField.setText("Invalid Input");
            }
            else{
                double length1 = Double.parseDouble(side1TF.getText());
                double length2 = Double.parseDouble(side2TF.getText());
                s = new Rectangle("Rectangle", length1, length2);
                if(s instanceof Rectangle){
                    outputLengthTextField.setText("The area of " + ((Rectangle) s).toString() + " is " + ((Rectangle) s).area());
                }
                else{
                    outputLengthTextField.setText("No instantiated Rectangle.");
                }
            }
        });
        frameSquare.add(panelSquare);
        panelSquare.add(side1L);
        panelSquare.add(side1TF);
        panelSquare.add(side2L);
        panelSquare.add(side2TF);
        panelSquare.add(calculateArea);
        panelSquare.add(outputLengthTextField);


    }
}

