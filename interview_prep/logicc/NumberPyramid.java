public class NumberPyramid {
    
    public static void main(String[] args) {
        int n =3;
        int val = 1;
        for(int i=1; i <= n ;i++)
        {
            for(int k = n-1-i ; k>=0 ; k--)
            {
                System.out.print("  ");
            }

            val = i;

            for(int j=1; j<=i; j++) 
            {
                System.out.print((val++) +" ");
                
            }

            val -= 2;
            for(int j=1; j<i ; j++)
            {
                System.out.print((val--) +" ");
                
            }

            System.out.println();
        }

    }           

}
