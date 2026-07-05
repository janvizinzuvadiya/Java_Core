import java.util.ArrayDeque;
import java.util.Deque;

public class bracesLogic 
{

    public static void main(String[] args) 
    {

        String str="(({})]";

        boolean flag = true;

        Deque<Character> stack = new ArrayDeque<>();
        

        if(str == null || str.length()%2 != 0)
            flag = false;
        else
        {
            for(char c : str.toCharArray())
            {
                if(c == '(' || c == '[' || c == '{')
                {
                    stack.push(c);
                }
                else
                {
                    if (stack.isEmpty())
                    {
                        flag = false;
                        break;
                    }
                    else
                    {
                        char top = stack.pop();
                        if(!(top == '(' && c == ')' 
                            || top == '[' && c == ']' 
                            || top == '{' && c == '}'))
                        {
                            flag = false; 
                            break;
                        }
                    }
                }
            }
        }
        if(flag && stack.isEmpty())
            System.out.println("True");
        else
            System.out.println("False");     
    }
}
