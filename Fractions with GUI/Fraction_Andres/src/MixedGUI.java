
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

/**
 * The GUI Class
 * Contains all the gui elements of the program
 */

public class MixedGUI {
    private JFrame main = new JFrame("Mixed Fraction Calculator");
    //Swing
    private JTextField outField;
    private JPanel ioFieldPanel;
    private JTextField tfwhole1, jnum1, jden1, jwhole2, jnum2, jextra, jden2;
    private JTextField operatorChosen;





    private int num1b=0;
    private int den1b=0;
    private int whole1b=0;
    private int num2b=0;
    private int den2b=0;
    private int whole2b=0;
    //Fractions
    MixedFraction mf1;
    MixedFraction mf2;
    MixedFraction mf3;
    Fraction f1;
    Fraction f2;
    Fraction f3;
    //Image
    private ImageIcon img = new ImageIcon("calculator.png");
    public boolean valid;
    //Sizes
    private final int frameHeight = 600, frameWidth = 495;
    private final int bHeight = 50, bWidth = 200;
    private final int fontSize = 18;
    //Colors
    private final Color ButtonColorBG = new Color(0x696969);
    private final Color ButtonColorFont = Color.WHITE;

    /**
     * Main
     */
    public static void main(String[] args){
        MixedGUI calc = new MixedGUI();
        try {
            calc.showGUI();
            calc.launch();
        } catch (Exception x){
            x.printStackTrace();
        }
    }

    /**
     * This method launches the window with certain properties:
     * 1. Resizable = false.
     * 2. Visible = true.
     */
    private void launch(){
        main.setResizable(false);
        main.setVisible(true);
        main.setSize(frameWidth, frameHeight);
        main.setLocationRelativeTo(null);
        main.setLayout(null);
    }

    /**
     * This method creates am array of buttons with their respective texts.
     */
    private JButton[] createButtons(){
        return new JButton[]{
                new JButton("Addition (+)"),
                new JButton("Subtraction (-)"),
                new JButton("Multiplication (x)"),
                new JButton("Division (÷)"),
                new JButton("Reduce Fraction 1"),
                new JButton("Reduce Fraction 2"),
                new JButton("Clear"),
                new JButton(""),
        };
    }

    /**
     * This method simply sets the location of all buttons and specific width and height.
     */
    private void setButtonPosition(JButton[] buttons){
        buttons[0].setBounds(40, 190, bWidth, bHeight); //add
        buttons[1].setBounds(240, 190, bWidth, bHeight); //sub
        buttons[2].setBounds(40, 250, bWidth, bHeight); //mul
        buttons[3].setBounds(240, 250, bWidth, bHeight); //div
        buttons[4].setBounds(40, 310, bWidth, bHeight); // red1
        buttons[5].setBounds(240, 310, bWidth, bHeight); //red2
        buttons[6].setBounds(190, 12, 100, bHeight); //red2
        buttons[7].setBounds(1, 1, 1, 1); //make last visible
    }

    /**
     * This method constructs the Output Text Field of the GUI Mixed Fraction Program, with their
     * respective properties such as location, color, font and size.
     */
    private void setIoField(){
        outField = new JTextField();
        ioFieldPanel = new JPanel();

        outField = new JTextField(28);
        outField.setBounds(40,400,400,140);

        outField.setBackground(Color.lightGray);
        outField.setBorder(BasicBorders.getSplitPaneDividerBorder());
        outField.setHorizontalAlignment(SwingConstants.CENTER);

        outField.setEditable(false);
        outField.setVisible(true);

        int fontSize = 20;
        outField.setFont(new Font("Bookman Old Style", Font.PLAIN, fontSize));
        outField.setForeground(Color.black);

        ioFieldPanel.add(outField);
        main.add(outField);
        main.add(ioFieldPanel);

        valid = true;
    }

    /**
     * This method creates the text fields for the
     * whole number, numerator, denominator, operator chosen,
     * and inputted by the user.
     */
    private void createTextFields(){
        int box = 40;
        tfwhole1 = new JTextField(7);
        tfwhole1.setBounds(40,80,box,box);
        jnum1 = new JTextField(7);
        jnum1.setBounds(90,52,box,box);
        jden1 = new JTextField(7);
        jden1.setBounds(90,102,box,box);
        jwhole2 = new JTextField(7);
        jwhole2.setBounds(347,80,box,box);
        jnum2 = new JTextField(7);
        jnum2.setBounds(397,52,box,box);
        jden2 = new JTextField(7);
        jden2.setBounds(397, 102,box,box);
        operatorChosen = new JTextField(7);
        operatorChosen.setBounds(220, 80, box, box);
        jextra = new JTextField(7);
        jextra.setBounds(290,102,box,box);

        tfwhole1.setBackground(Color.BLACK);
        jnum1.setBackground(Color.BLACK);
        jden1.setBackground(Color.BLACK);
        jwhole2.setBackground(Color.BLACK);
        jnum2.setBackground(Color.BLACK);
        jden2.setBackground(Color.BLACK);
        operatorChosen.setBackground(Color.BLACK);
        jextra.setBackground(Color.BLACK);

        tfwhole1.setVisible(true);
        jnum1.setVisible(true);
        jden1.setVisible(true);
        jwhole2.setVisible(true);
        jnum2.setVisible(true);
        jden2.setVisible(true);
        operatorChosen.setVisible(true);
        jextra.setVisible(true);

        operatorChosen.setEditable(false);
        operatorChosen.setHorizontalAlignment(SwingConstants.CENTER);

        tfwhole1.setFont(new Font("Bookman Old Style", Font.PLAIN, fontSize));
        tfwhole1.setForeground(Color.white);
        jnum1.setFont(new Font("Bookman Old Style", Font.PLAIN, fontSize));
        jnum1.setForeground(Color.white);
        jden1.setFont(new Font("Bookman Old Style", Font.PLAIN, fontSize));
        jden1.setForeground(Color.white);
        jwhole2.setFont(new Font("Bookman Old Style", Font.PLAIN, fontSize));
        jwhole2.setForeground(Color.white);
        jnum2.setFont(new Font("Bookman Old Style", Font.PLAIN, fontSize));
        jnum2.setForeground(Color.white);
        jden2.setFont(new Font("Bookman Old Style", Font.PLAIN, fontSize));
        jden2.setForeground(Color.white);
        operatorChosen.setFont(new Font("Bookman Old Style", Font.PLAIN, fontSize));
        operatorChosen.setForeground(Color.white);

        main.add(tfwhole1);
        main.add(jnum1);
        main.add(jden1);
        main.add(jwhole2);
        main.add(jnum2);
        main.add(jden2);
        main.add(operatorChosen);
        main.add(jextra);
    }

    /**
     * This method compiles the other methods to initiate the window.
     */
    private void showGUI(){
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        main.getContentPane().setBackground(Color.WHITE);
        main.setIconImage(img.getImage());

        JButton[] buttons = createButtons();

        setIoField();
        setButtonPosition(buttons);

        for(JButton button : buttons){
            button.setBackground(ButtonColorBG);
            button.setForeground(ButtonColorFont);
            button.setFont(new Font("Bookman Old Style", Font.PLAIN, fontSize));
            main.add(button);
        }

        createTextFields();

        ActionListener(buttons);
    }

    /**
     * This method creates the actions that the buttons of the GUI program will do when clicked
     * @param buttons buttons is the arraw of buttons to be given a certain action when clicked.
     */
    private void ActionListener(JButton[] buttons){
        buttons[0].addActionListener(e -> {
            operatorChosen.setText("+");
            try {
                if(tfwhole1.getText().equals("")){
                    whole1b = 0;
                }
                else{
                    whole1b = Integer.parseInt(tfwhole1.getText());}

                num1b = Integer.parseInt(jnum1.getText());
                den1b = Integer.parseInt(jden1.getText());
                mf1 = new MixedFraction(whole1b, num1b, den1b);

                if(jwhole2.getText().equals("")){
                    whole2b = 0;
                }
                else{
                    whole2b = Integer.parseInt(jwhole2.getText());}

                num2b = Integer.parseInt(jnum2.getText());
                den2b = Integer.parseInt(jden2.getText());
                mf2 = new MixedFraction(whole2b, num2b, den2b);

                if(tfwhole1.getText().equals("") && jwhole2.getText().equals("")){
                    f1 = new Fraction(num1b, den1b);
                    f2 = new Fraction(num2b, den2b);
                    f3 = f1.addFraction(f2);
                    f3.reduce();
                    outField.setText("Addition = " + f3.toString());
                }
                else if(tfwhole1.getText().equals("")){
                    whole1b = 0;
                    mf1 = new MixedFraction(whole1b, num1b, den1b);
                    mf3 = mf1.add(mf2);
                    mf3.reduce();
                    outField.setText("Addition = " + mf3.toString());
                }
                else if(jwhole2.getText().equals("")){
                    whole2b = 0;
                    mf2 = new MixedFraction(whole2b, num2b, den2b);
                    mf3 = mf1.add(mf2);
                    mf3.reduce();
                    outField.setText("Addition = " + mf3.toString());
                }
                else {
                    mf3 = mf1.add(mf2);
                    mf3.reduce();
                    outField.setText("Addition = " + mf3.toString());
                }
            } catch(Exception ex){
                infoBox("Invalid / Missing input(s)", "Syntax Error");
            }
        });

        buttons[1].addActionListener(e -> {
            operatorChosen.setText("-");
            try {
                if(tfwhole1.getText().equals("")){
                    whole1b = 0;
                }
                else{
                    whole1b = Integer.parseInt(tfwhole1.getText());}

                num1b = Integer.parseInt(jnum1.getText());
                den1b = Integer.parseInt(jden1.getText());
                mf1 = new MixedFraction(whole1b, num1b, den1b);

                if(jwhole2.getText().equals("")){
                    whole2b = 0;
                }
                else{
                    whole2b = Integer.parseInt(jwhole2.getText());}

                num2b = Integer.parseInt(jnum2.getText());
                den2b = Integer.parseInt(jden2.getText());
                mf2 = new MixedFraction(whole2b, num2b, den2b);

                if(tfwhole1.getText().equals("") && jwhole2.getText().equals("")){
                    f1 = new Fraction(num1b, den1b);
                    f2 = new Fraction(num2b, den2b);
                    f3 = f1.subtractFraction(f2);
                    f3.reduce();
                    outField.setText("Subtraction = " + f3.toString());
                }
                else if(tfwhole1.getText().equals("")){
                    whole1b = 0;
                    mf1 = new MixedFraction(whole1b, num1b, den1b);
                    mf3 = mf1.subtract(mf2);
                    mf3.reduce();
                    outField.setText("Subtraction = " + mf3.toString());
                }
                else if(jwhole2.getText().equals("")){
                    whole2b = 0;
                    mf2 = new MixedFraction(whole2b, num2b, den2b);
                    mf3 = mf1.subtract(mf2);
                    mf3.reduce();
                    outField.setText("Subtraction = " + mf3.toString());
                }
                else {
                    mf3 = mf1.subtract(mf2);
                    mf3.reduce();
                    outField.setText("Subtraction = " + mf3.toString());
                }
            } catch(Exception ex){
                infoBox("Invalid / Missing input(s)", "Syntax Error");
            }
        });

        buttons[2].addActionListener(e -> {
            operatorChosen.setText("x");
            try {
                if(tfwhole1.getText().equals("")){
                    whole1b = 0;
                }
                else{
                    whole1b = Integer.parseInt(tfwhole1.getText());}
                num1b = Integer.parseInt(jnum1.getText());
                den1b = Integer.parseInt(jden1.getText());
                mf1 = new MixedFraction(whole1b, num1b, den1b);

                if(jwhole2.getText().equals("")){
                    whole2b = 0;
                }
                else{
                    whole2b = Integer.parseInt(jwhole2.getText());}

                num2b = Integer.parseInt(jnum2.getText());
                den2b = Integer.parseInt(jden2.getText());
                mf2 = new MixedFraction(whole2b, num2b, den2b);

                if(tfwhole1.getText().equals("") && jwhole2.getText().equals("")){
                    f1 = new Fraction(num1b, den1b);
                    f2 = new Fraction(num2b, den2b);
                    f3 = f1.multiplyFraction(f2);
                    f3.reduce();
                    outField.setText("Multiplication = " + f3.toString());
                }
                else if(tfwhole1.getText().equals("")){
                    whole1b = 0;
                    mf1 = new MixedFraction(whole1b, num1b, den1b);
                    mf3 = mf1.multiply(mf2);
                    mf3.reduce();
                    outField.setText("Multiplication = " + mf3.toString());
                }
                else if(jwhole2.getText().equals("")){
                    whole2b = 0;
                    mf2 = new MixedFraction(whole2b, num2b, den2b);
                    mf3 = mf1.multiply(mf2);
                    mf3.reduce();
                    outField.setText("Multiplication = " + mf3.toString());
                }
                else {
                    mf3 = mf1.multiply(mf2);
                    mf3.reduce();
                    outField.setText("Multiplication = " + mf3.toString());
                }
            } catch(Exception ex){
                infoBox("Invalid / Missing input(s)", "Syntax Error");
            }
        });

        buttons[3].addActionListener(e -> {
            operatorChosen.setText("÷");
            try {
                if(tfwhole1.getText().equals("")){
                    whole1b = 0;
                }
                else{
                    whole1b = Integer.parseInt(tfwhole1.getText());}

                num1b = Integer.parseInt(jnum1.getText());
                den1b = Integer.parseInt(jden1.getText());
                mf1 = new MixedFraction(whole1b, num1b, den1b);

                if(jwhole2.getText().equals("")){
                    whole2b = 0;
                }
                else{
                    whole2b = Integer.parseInt(jwhole2.getText());}

                num2b = Integer.parseInt(jnum2.getText());
                den2b = Integer.parseInt(jden2.getText());
                mf2 = new MixedFraction(whole2b, num2b, den2b);

                if(tfwhole1.getText().equals("") && jwhole2.getText().equals("")){
                    f1 = new Fraction(num1b, den1b);
                    f2 = new Fraction(num2b, den2b);
                    f3 = f1.divideFraction(f2);
                    f3.reduce();
                    outField.setText("Division = " + f3.toString());
                }
                else if(tfwhole1.getText().equals("")){
                    whole1b = 0;
                    mf1 = new MixedFraction(whole1b, num1b, den1b);
                    mf3 = mf1.divide(mf2);
                    mf3.reduce();
                    outField.setText("Division = " + mf3.toString());
                }
                else if(jwhole2.getText().equals("")){
                    whole2b = 0;
                    mf2 = new MixedFraction(whole2b, num2b, den2b);
                    mf3 = mf1.divide(mf2);
                    mf3.reduce();
                    outField.setText("Division = " + mf3.toString());
                }
                else {
                    mf3 = mf1.divide(mf2);
                    mf3.reduce();
                    outField.setText("Division = " + mf3.toString());
                }
            } catch(Exception ex){
                infoBox("Invalid / Missing input(s)", "Syntax Error");
            }
        });

        buttons[4].addActionListener(e -> {
            try {
                if(tfwhole1.getText().equals("")){
                    whole1b = 0;
                }
                else{
                    whole1b = Integer.parseInt(tfwhole1.getText());
                }
                num1b = Integer.parseInt(jnum1.getText());
                den1b = Integer.parseInt(jden1.getText());
                mf1 = new MixedFraction(whole1b, num1b, den1b);

                mf1.reduce();
                outField.setText(mf1.toString());
            }
            catch(Exception ex){
                infoBox("Invalid / Missing input(s)", "Syntax Error");
            }
        });

        buttons[5].addActionListener(e -> {
            try {
                if (tfwhole1.getText().equals("")) {
                    whole1b = 0;
                } else {
                    whole1b = Integer.parseInt(tfwhole1.getText());
                }
                num2b = Integer.parseInt(jnum2.getText());
                den2b = Integer.parseInt(jden2.getText());
                mf2 = new MixedFraction(whole2b, num2b, den2b);

                mf2.reduce();
                outField.setText(mf2.toString());
            }
            catch(Exception ex){
                infoBox("Invalid / Missing input(s)", "Syntax Error");
            }
        });

        buttons[6].addActionListener(e -> {
            tfwhole1.setText("");
            jnum1.setText("");
            jden1.setText("");
            jwhole2.setText("");
            jnum2.setText("");
            jden2.setText("");
            operatorChosen.setText("");
        });
    }

    /**
     * This method pops out an error pane if an error has occurred.
     * @param infoMessage is the message warning.
     * @param titleBar is the error title of the warning.
     */
    private static void infoBox(String infoMessage, String titleBar)
    {
        JLabel label = new JLabel(infoMessage);
        label.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
        JOptionPane.showMessageDialog(null, label, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
