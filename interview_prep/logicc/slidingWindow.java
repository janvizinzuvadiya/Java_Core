public class slidingWindow {
    
    public static void main(String[] args) {
        
        int window = 3;
        int [] nums = {2, 1, 5, 1, 3, 2};
        int max = 0;
        int temp = 0;
        
        if(nums == null || nums.length < window)
        {
            System.out.println("False");
        }
        else
        {
            for(int i= 0 ; i < window ; i++)
            {
                max += nums[i];   
            }
            
            temp = max;

            for(int i = window ; i < nums.length ; i++ )
            {
                temp = temp - nums[i - window] + nums[i];
                max = Math.max(max, temp);   
            }
            
            System.out.println(max);
        }
















    }

}
