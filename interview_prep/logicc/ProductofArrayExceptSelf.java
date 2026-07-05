public class ProductofArrayExceptSelf 
{
    
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4};
        int [] ans = new int[arr.length];

        for(int i=0 ; i< arr.length ; i++)
        {
            ans[i] = 1;
            for(int j = 0; j<arr.length ; j++)
            {
                if(i == j)
                {
                    continue;
                }
                ans[i] *= arr[j];
            }
        }
      
        for(int i : ans)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }


}
