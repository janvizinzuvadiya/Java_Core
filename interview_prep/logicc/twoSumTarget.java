public class twoSumTarget 
{    
    public static void main(String[] args) {
        
        int[] nums = {2, 3, 4, 10};
        int target = 6;

        for (int i = 0 ; i < nums.length-1 ; i++)
        {
            int diff = target - nums[i];
            
           for(int j = i+1 ; j < nums.length ; j++)
           {
            // System.out.println(nums[i]+" "+nums[j]);
                if(diff == nums[j])
                {
                    System.out.println("["+i + " " + j+"]");
                    break;
                }
           }
        }
    }
}
