// arr ={2,7,11,15} target = 9

public class two_sum_arr 
{

    public static void main(String[] args) {
        
        int[] array = {2,7,11,15};
        int target = 9;
        int[] ans = new int[2];


            int i = 0;
            int j = 0;
            while(i<array.length && j<array.length)
            {
                j = i+1;
                // System.out.println(array[i] +" + "+ array[j]);
                int sum = array[i]+array[j];
                if( sum == target)
                {
                    ans[0] = array[i];
                    ans[1] = array[j];
                }
                else
                {
                    j++;
                   
                }
                i++;
                
            }
            System.out.println(ans[0]+" "+ans[1]);
           
        //numbers = [2, 7, 11, 15], target = 9


    // public static void main(String[] args) {
    //     int[] num = new int[]{2, 7, 11, 15};
    //     int target = 9;

    //     int j = 1;
    //     for (int i = 0; i < num.length; i++) {
    //         if (num[i] == target - num[j]) {
    //             System.out.println(num[i] + " " + num[j]);
    //         } else {
    //             j++;
    //         }
    //     }
    // }

    }
}
