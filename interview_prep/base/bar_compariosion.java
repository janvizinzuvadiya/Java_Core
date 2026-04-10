public class bar_compariosion 
{

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int maxArea = 0;

        int[] ans = new int[2];

        int i = 0;
        int j = 0;
        while(i<height.length-1 && j<height.length)
        {
            j = i+1;
            // System.out.println(height[i]+" * "+height[j]+" = "+height[i]*height[j]);
            
            int area = height[i]*height[j] ;
            if(area > maxArea)
            {
                maxArea = area;
                ans[0] = height[i];
                ans[1] = height[j];
            }
            i++;
            
        }
        System.out.println(ans[0]+" * "+ans[1]+" = "+maxArea);

    }

    // public static void main(String[] args) {
    //     int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
    //     int max = 0;
    //     int j = 1;

    //     for (int i = 0; i < height.length; i++) {
    //         int volume = height[i] * height[j];
    //         // System.out.println("h[i] : " + height[i] + " * " +" h[j] : " + height[j]);
    //         // System.out.println("vol : " + volume);
    //         if (volume >= max) {
    //             max = volume;
    //             j++;
    //         } 
    //     }
    //     System.out.println("Max Volume : " + max);
    // }
    
}
