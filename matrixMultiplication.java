public class matrixMultiplication
{
    public static void main (String args[])
    {

    }
}

class matrix
{
    private int[][] matrix1;
    private int[][] matrix2;

    public matrix()
    {
        matrix1 = {{1,2,-2,0},
                   {-3,4,7,2},
                   {6,0,3,1}};
        matrix2 = {{-1,3},
                   {0,9},
                   {1,-11},
                   {4,-5}};
    }

    public int[][] multiplyMatrices ()
    {
        int[][] productMatrix = [matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix1[0].length; j++)
            {
                productMatrix[i][j] = (matrix1[i][j] * matrix2[j][i]);  
            }
        }
    }
}