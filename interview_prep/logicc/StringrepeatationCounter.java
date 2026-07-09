public class StringrepeatationCounter 
{
    public static void main(String[] args) {
        char [] arr = {'a','a','a','b','b','c','c','d'};
        char [] result = new char[arr.length];

        int count = 1;

        for(int i = 0,j = 0; i < arr.length ; i++ )
        {
            
            if(i< arr.length-1 && arr[i] == arr[i+1] )
            {
                count++;
                continue;
            }
            else
            {
                result[j] = arr[i];
                j++;
                result[j] = (char)('0'+count);
                j++;
                count = 1;
            }          
            
        }
        System.out.print(result);  
    } 
}
