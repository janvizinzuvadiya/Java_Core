public class substringrepeatation {
    
public static void main(String[] args) {
    String str = "uuabcabcaa";
    String result = "";

    char start = str.charAt(0);
    char end = str.charAt(0);
    int count = 1;
    
    for(int i = 0,j=0 ; i < str.length(); i++ )
    {   
       if(start != str.charAt(i+1))
       {
            j++;
            end = str.charAt(j);
       }
       else
       {
            start = str.charAt(i+1);
            j=i+1;
       }
    }
    result = str.substring(start,end);

    System.out.println(result);

}}
