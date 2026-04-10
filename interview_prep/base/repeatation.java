// aabbccaadddd
// 2a2b2c2a4d

public class repeatation {
    public static void main(String[] args) 
    {
        String str = "aabbccaadddd";
        String ans = "";
        int count = 1;
        for(int i=0; i<str.length(); i++)
        {
            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
            }
            else
            {
                ans += count + "" + str.charAt(i);
                count = 1;
            }
        }
        System.out.println(ans);   
        System.out.println(str.length());
    }
}
