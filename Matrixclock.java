public class Matrixclock {
    public static void main (String args []){
        int matrix [][]   = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i =0; i<rows ; i++){
            for (int j =1+i ; j <rows ; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix [j][i]= temp ; 
            }
        }
        for (int i = 0;i<rows ;i++){
            for (int j = 0 ,k=rows-1;j<k;j++,k--){
                int temp = matrix[i][j];    
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }

        for (int i = 0;i<rows;i++){
            for (int j = i+1; j<columns ; j++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            
        }
    for (int i = 0 ; i < rows ;i++){
        for (int j = 0 ;j<rows; j++){
            System.out.print(matrix[i][j]+" ");
        }System.out.println();
    }
}}


