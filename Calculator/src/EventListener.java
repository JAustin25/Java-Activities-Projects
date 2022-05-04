import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class EventListener implements ActionListener
{
    JButton button = new JButton();
    static String [] arraystring = new String [] {};
    private CalcAustin Calc;
    private ArrayList<String> list=new ArrayList<String>();
    ArrayList his = new ArrayList ();
    private String out = "";
    private String results = "";
    private ArrayList arr = new ArrayList  ();



    public void actionPerformed(ActionEvent event)
    {
        JButton button = (JButton) event.getSource();
        if(button.getText().equals("="))
        {
            try
            {
                Computation f = new Computation();
                double result = f.compute(out);
                Calc.text.setText(Double.toString(result));
            } catch(Exception e) {
                Calc.text.setText("Input Error!");
            }
        } else if(button.getText().equals("×")) {
            if(list.isEmpty())
            {
                arr.add("*");
                results += "*";
                out = results;
                Calc.text.setText(results);
            } else {
                list.add("*");
                results += "*";
                out = results;
                Calc.text.setText(results);
            }
        } else if(button.getText().equals("÷")) {
            if(list.isEmpty())
            {
                arr.add("/");
                results += "/";
                out = results;
                Calc.text.setText(results);
            } else {
                list.add("/");
                results += "/";
                out = results;
                Calc.text.setText(results);
            }
        } else if(button.getText().equals("Delete")) {
            if(list.isEmpty())
            {
                arr.remove(arr.size()-1);
                results = "";
                for(int i = 0; i < arr.size(); i++) results += arr.get(i);
                out = results;
                Calc.text.setText(results);
            } else {
                list.remove(list.size()-1);
                String output = "";
                for(int i = 0; i < list.size(); i++) output+=list.get(i);
                out = output;
                Calc.text.setText(output);
            }
        } else if(button.getText().equals("Clear")) {
            his.add(out);
            list.clear();
            results ="";
            Calc.text.setText(results);
        } else if(button.getText().equals("Back")) {
            results = (String) his.get(his.size()-1);
            Calc.text.setText(results);
            arr.clear();
            char[] a= results.toCharArray();
            for(int i=0;i<a.length;i++)
            {
                arr.add(String.valueOf(a[i]));
            }
            his.remove(his.size()-1);
        } else {
            if(list.isEmpty())
            {
                arr.add(button.getText());
                results +=button.getText();
                out= results;
                Calc.text.setText(results);
            } else {
                list.add(button.getText());
                results +=button.getText();
                out= results;
                Calc.text.setText(results);
            }
        }
    }
    public EventListener(CalcAustin Calc)
    {
        this.Calc = Calc;
    }
}