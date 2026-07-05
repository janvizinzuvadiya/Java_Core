public class RotateMatrixRepresentation {
    

    public static void main(String[] args) {
        

        int mat [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = mat.length;

        int result [][] = new int [n][n];

        for(int i = 0 ; i< n ; i++)
        {
            for(int j = n-1; j >= 0 ; j--)
            {
                result[i][n-1-j] =  mat[j][i];
            }

        }

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                System.out.print(result[i][j]+" ");
            }

            System.out.println();
        }

    }








}
