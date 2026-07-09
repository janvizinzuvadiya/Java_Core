public class AskedQuestion 
{
    public static void main(String [] args)
    {
        StringBuilder str = new StringBuilder("aa@@@bbcc12@@@aa#!zddddc");
        StringBuilder res = new StringBuilder("");
        int count = 1;

        for(int i = 0; i < str.length() ; i++)
        {
            // if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) 
            // {
            //     
            //         count++;
            //     
            // }
            // else 
            // {
            //     char c = str.charAt(i);
            //     if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) 
            //     {
            //          res +=count + ""+str.charAt(i);
            //     }
            //     else
            //     {
            //          res +=c;
            //     }
            // }
            // }

            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
            {
                count = 1;
                while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
                {
                    count++;
                    i++;
                } 
                if(count>1)            
                    res.append(count + ""+ str.charAt(i-1));
                else
                    res.append("1" + str.charAt(i));
            }
            else
            {
                res.append(str.charAt(i));
            }
        }

        System.out.println(res);
    }
}
