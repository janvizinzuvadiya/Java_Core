import java.util.ArrayList;
import java.util.List;

public class CircleQuestion 
{
    public static void main(String[] args) 
    {
        List<Integer> ls = new ArrayList<>();
        for(int i = 1; i < 11 ; i++)
            ls.add(i);

        int i =0;

        while(ls.size()>1)
        {   
            System.out.println("Removed->"+ls.get(i+1));
            ls.remove(i+1);

            System.out.println();

            if(i == ls.size()-1 )
                i =0;
            else
                i++;
            
            System.out.println("At->"+ls.get(i)+"\tvalue of i->"+i);
            System.out.println("size->"+ls.size()+"\n---------x---------");
        }
 
        System.out.println(ls.get(0));
    }
}
