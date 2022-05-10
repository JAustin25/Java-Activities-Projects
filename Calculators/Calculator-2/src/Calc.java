import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Calc {
    private JButton Clear = new JButton("Clear");
    private JButton Exit = new JButton("Exit");
    private JPanel panel= new JPanel();
    private JFrame frame = new JFrame("Calculator");
    private JTextArea txt = new JTextArea();
    String strNum1 = "";
    String strNum2 = "";
    String[] statement;
    String Total = "";
    double num1 = 0;
    double num2 = 0;
    double totalVal = 0;

    private JButton Equal = new JButton("=");
    private JButton Division = new JButton("/");
    private JButton Multiplication = new JButton("*");
    private JButton Subtraction = new JButton("-");
    private JButton Addition = new JButton("+");
    private JButton Decimals = new JButton(".");
    private JButton zero = new JButton("0");
    private JButton one = new JButton("1");
    private JButton two = new JButton("2");
    private JButton three = new JButton("3");
    private JButton four = new JButton("4");
    private JButton five = new JButton("5");
    private JButton six = new JButton("6");
    private JButton seven = new JButton("7");
    private JButton eight = new JButton("8");
    private JButton nine = new JButton("9");

    public Calc() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(410, 560);
        frame.setResizable(false);
        frame.setLayout(null);
        txt.setSize(380, 150);
        txt.setLocation(7, 15);
        txt.setEditable(false);

        zero.setSize(80, 50);
        zero.setLocation(105, 470);
        zero.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("0");
            }
        });
        Division.setSize(70, 60);
        Division.setLocation(310, 180);
        Division.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("/");
            }
        });
        Multiplication.setSize(70, 60);
        Multiplication.setLocation(310, 250);
        Multiplication.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("*");
            }
        });
        Subtraction.setSize(70, 60);
        Subtraction.setLocation(310, 320);
        Subtraction.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("-");
            }
        });
        Addition.setSize(70, 60);
        Addition.setLocation(310, 390);
        Addition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("+");
            }
        });
        Exit.setSize(80,40);
        Exit.setLocation(10,180);
        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        one.setSize(80, 50);
        one.setLocation(10, 395);
        one.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("1");
            }
        });

        two.setSize(80, 50);
        two.setLocation(105, 395);
        two.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("2");
            }
        });
        three.setSize(80, 50);
        three.setLocation(200, 395);
        three.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("3");
            }
        });

        four.setSize(80, 50);
        four.setLocation(10, 310);
        four.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("4");
            }
        });
        five.setSize(80, 50);
        five.setLocation(105, 310);
        five.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("5");
            }
        });

        six.setSize(80, 50);
        six.setLocation(200, 310);
        six.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("6");
            }
        });

        seven.setSize(80, 50);
        seven.setLocation(10, 230);
        seven.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("7");
            }
        });

        eight.setSize(80, 50);
        eight.setLocation(105, 230);
        eight.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("8");
            }
        });
        nine.setSize(80, 50);
        nine.setLocation(200, 230);
        nine.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append("9");
            }
        });
        Decimals.setSize(80, 50);
        Decimals.setLocation(200, 470);
        Decimals.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                txt.append(".");
            }
        });
        Clear.setSize(80, 50);
        Clear.setLocation(10, 470);
        Clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
               txt.setText("");
                txt.setText("");
            }
        });
        Equal.setSize(70, 60);
        Equal.setLocation(310, 460);
        Equal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(txt.getText().contains("+")){
                    statement = txt.getText().split("\\+");
                    strNum1 = statement[0];
                    strNum2 = statement[1];
                    num1 = Double.parseDouble(strNum1);
                    num2 = Double.parseDouble(strNum2);
                    totalVal = num1 + num2;
                    Total = Double.toString(totalVal);

                    txt.setText(Total);
                }
                else if(txt.getText().contains("-")){
                    statement = txt.getText().split("\\-");
                    strNum1 = statement[0];
                    strNum2 = statement[1];
                    num1 = Integer.parseInt(strNum1);
                    num2 = Integer.parseInt(strNum2);

                    totalVal = num1 - num2;

                    Total = Double.toString(totalVal);

                    txt.setText(Total);
                }
                else if(txt.getText().contains("/")){
                    statement = txt.getText().split("\\/");

                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Double.parseDouble(strNum1);
                    num2 = Double.parseDouble(strNum2);

                    totalVal = num1 / num2;

                    Total = Double.toString(totalVal);

                    txt.setText(Total);
                }
                else if(txt.getText().contains("*")){
                    statement = txt.getText().split("\\*");

                    strNum1 = statement[0];
                    strNum2 = statement[1];

                    num1 = Double.parseDouble(strNum1);
                    num2 = Double.parseDouble(strNum2);

                    totalVal = num1 * num2;
                    Total = Double.toString(totalVal);

                    txt.setText(Total);
                }
            }
        });
        frame.add(Clear);
        frame.add(Exit);
        frame.add(txt);
        frame.add(zero);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(Division);
        frame.add(Multiplication);
        frame.add(Subtraction);
        frame.add(Addition);
        frame.add(Decimals);
        frame.add(Equal);

        SwingUtilities.updateComponentTreeUI(frame);
    }

    public static void main(String[] args) {
        new Calc();
    }

}