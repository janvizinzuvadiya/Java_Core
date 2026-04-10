// ["a","a","b","b","c","c","c"] -> ["a","2","b","2","c","3"] 

public class compress_array 
{
    public static void main(String[] args) 
    {
        String[] arr = new String[]{"a","a","b","b","c","c","c"};
        int count = 1;
        String ans = "";
        int len = 0;

        for(int i = 0;i<arr.length;i++)
        {
            if(i< arr.length-1 && arr[i] == arr[i+1])
            {
                count++;
            }
            else
            {
                ans += arr[i]+","+count+",";
                count = 1;
                len+=2;
            }
        }
        
       char [] result = new char[len];

       int j = 0;
       for(int i=0;i<ans.length();i++)
       {
            if(!(ans.charAt(i) == ','))
            {
                result[j] = ans.charAt(i);
                j++;
            }
       }


       for(char val : result)
       {            System.out.println(val);
       }
        // System.out.println(ans);
    }
    
}
