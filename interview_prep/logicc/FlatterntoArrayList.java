import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatterntoArrayList {

    public static void main(String[] args) {
        
        List<Object> arr = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        List<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(1);

        int a2[] = {1,1};
        int a3 = 2;

        arr.add(a1);
        arr.add(a3);
        arr.add(Arrays.asList(a2));

        for(Object val : arr)
        {
            if(val instanceof List)
            {
                for(Object x : val)
                {
                    result.add((Integer)x);
                }
            }
            else
            {
                result.add((Integer)val);
            }    
        }
        
        for (Integer i : result)
        {
            System.out.println(i);
        }
        
        System.out.println(arr);
    }
}
