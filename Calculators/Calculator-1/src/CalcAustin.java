import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/** The class is used to create a GUI */
/** The calculataor can only perform the precedence of the given */
public class CalcAustin extends JFrame
{

    JButton[][] b = new JButton[4][5];
    JTextField text = new JTextField();
    JPanel row = new JPanel();
    String[][] buttons = {{"0","(",")","Back","="},
            {"1","2","3","+","-"},
            {"4","5","6","×","÷"},
            {"7","8","9","Delete","Clear"}};
    public CalcAustin()
    {

        super("Calculator");
        setSize(400,400);
        setBackground(Color.WHITE);
        //setShape();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        text.setPreferredSize(new Dimension(50, 70));
        text.setSize(120, 40);
        text.setHorizontalAlignment(SwingConstants.TRAILING);
        text.setEditable(false);
        getContentPane().add(text, BorderLayout.NORTH);
        add(row, BorderLayout.CENTER);
        GridLayout layout2 = new GridLayout(4,5,5,5);
        row.setLayout(layout2);

        for(int i = 0; i < buttons.length; i++)
        {
            for(int j = 0; j < buttons[0].length; j++)
            {
                b[i][j] = new JButton(buttons[i][j]);
                row.add(b[i][j]);
            }
        }
        add(row);
        setResizable(false);
        setVisible(true);
    }


    public static void main(String[] args)
    {
        CalcAustin cl = new CalcAustin();
        cl.listener();
    }

    public void listener()
    {
        EventListener l = new EventListener(this);
        for(int i = 0; i < buttons.length; i++)
        {
            for(int j = 0; j < buttons[0].length; j++)
            {
                b[i][j].addActionListener(l);
            }
        }
    }
}