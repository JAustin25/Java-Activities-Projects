import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
public class Computation {
    private int go;
    private String[] str=new String[10];

    public Computation(){

//test





    }
    public double compute(String exp)
    {
        char[] ch = exp.toCharArray();
        String convertPostFix = new String();
        int size = ch.length;

        Stack <Character> stack = new Stack<>();

        go = 0;
        for (int i = 0; i < size; i++) {
            if(ch[i] == '(') stack.push(ch[i]);
            else if(ch[i] == ')') {
                char popValue = stack.pop();
                do
                {
                    convertPostFix = convertPostFix.concat(String.valueOf(popValue));
                    popValue = stack.pop();
                }while(!stack.isEmpty() && popValue != '(');
            } else if(checkOperator(ch[i])) {
                if(stack.isEmpty()) stack.push(ch[i]);
                else {
                    char popValue = stack.pop();
                    while(checkPriority(popValue,ch[i]))
                    {
                        convertPostFix = convertPostFix.concat(String.valueOf(popValue));
                        if(stack.isEmpty()) break;
                        popValue = stack.pop();
                    }
                    if(!checkPriority(popValue,ch[i])) stack.push(popValue);
                    stack.push(ch[i]);
                }
            } else if(checkDigital(ch[i])) {
                if(i + 1 < size && i - 1 >= 0)
                {
                    if(checkDigital(ch[i - 1]) && !checkDigital(ch[i + 1]))
                    {
                        int end = i;
                        int j = end;
                        while(checkDigital(ch[j]))
                        {
                            j--;
                        }
                        j++;
                        List<String> elements = new LinkedList<>();
                        do
                        {
                            elements.add(String.valueOf(ch[j]));
                            j++;
                        } while(j <= end);
                        str[go] = String.join("", elements);
                        System.out.println(str[go]);
                        go++;
                    }
                }
                convertPostFix=convertPostFix.concat(String.valueOf(ch[i]));
            }
        }
        while(!stack.isEmpty())
        {
            char popValue = stack.pop();
            convertPostFix = convertPostFix.concat(String.valueOf(popValue));
        }
        System.out.println(convertPostFix);
        return computeResult(convertPostFix);
    }
    public double computeResult(String convertToPostfix)
    {
        int[] index=new int[10];
        for(int i = 0; i < go; i++)
        {
            index[i] = convertToPostfix.indexOf(str[i]);
            System.out.println(index[i]);
        }
        char[] ch = convertToPostfix.toCharArray();
        Stack <Double> stack = new Stack<>();
        double result = 0;
        for (int i = 0; i < ch.length; i++) {
            if(checkOperator(ch[i]))
            {
                double num2=stack.pop();
                System.out.println("num2" + num2);
                System.out.print("\n");
                double num1=stack.pop();
                System.out.println("num1" + num1);
                System.out.print("\n");
                switch(ch[i])
                {
                    case '*':
                        result = num2 * num1;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                }
                System.out.println(result);
                stack.push(result);
            } else {
                int stop = 0;
                for(int j = 0; j < go; j++)
                {
                    if(i == index[j])
                    {
                        int start=i;
                        List<String> elements = new LinkedList<>();
                        do
                        {
                            elements.add(String.valueOf(ch[i]));
                            i++;
                        } while(i < str[j].length() + start);
                        i--;
                        String test=String.join("", elements);
                        stack.push(Double.valueOf(test));
                        stop=1;
                        break;
                    }
                }
                if(stop == 0) stack.push((double)ch[i]-48);
            }
        }
        System.out.print("\n");
        System.out.print(result);
        return result;
    }

    public boolean checkOperator(char c)
    {
        int result;
        switch(c)
        {
            case '+':
            case '-':
            case '*':
            case '/':
                result = 1;
                break;
            default:
                result = 0;
        }
        if(result == 1) return true;
        else return false;
    }
    public boolean checkDigital(char c)
    {
        int num = c;
        num -= 48;
        if(num >= 0 && num <= 9) return true;
        else return false;
    }

    public boolean checkPriority(char popOne,char checkOne)
    {
        if((popOne == '*' || popOne == '/') && (checkOne == '+' || checkOne == '-'))
            return true;

        else if(popOne == checkOne)

            return true;
        else
            return false;
    }
}