// arr1 = {1,4,7,8}
// arr2 = {2,5,6}
// merged = {1,2,4,5,6,7,8}

public class array_sort_merge 
{
    public static void main(String[] args){
        int arr1[]=new int[]{1,4,7,8,11};
        int arr2[]=new int[]{2,5,6,9,10};

        int n=arr1.length+arr2.length;
        //System.out.println(n);

        int[] result = new int[arr1.length + arr2.length];
        // int maxLen=(arr1.length<arr2.length)?arr1.length:arr2.length;
        int a1len = arr1.length;
        int a2len=arr2.length;
        // System.out.println(maxLen);
        System.out.println(a1len);
        System.out.println(a2len);
        System.out.println(n);
        System.out.println("------------------------");

        int j=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(j<a1len && k<a2len)
            {
                if(arr1[j] < arr2[k])
                {
                    System.out.println(arr1[j]);
                    result[i] = arr1[j];
                    j++;  
                }
                else{
                    System.out.println(arr2[k]);
                    result[i] = arr2[k];
                    k++;  
                }
            }
            else{
                if(a1len>a2len){
                    System.out.println(arr1[j]);
                    result[i]=arr1[j];
                    j++;                     
                }
                else{
                    System.out.println(arr2[k]);
                    result[i]=arr2[k];
                    k++;                     
                }
            }
        }
        // for(int val : result){
        //     System.out.println(val);
        // }
    }
    
}