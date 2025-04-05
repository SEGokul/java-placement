public class Assessment13 {
    public static void main(String args []){
        int matrix[][]= {{5,4,7},{1,8,3},{9,6,2}};
        int rows = matrix.length;
        int columns= matrix[0].length;
        for (int i = 0 ; i<rows;i++){
            for (int j=0;j<columns;j++){
                if (matrix[i][j]==1){
                    matrix[i][j]=4;
                }
                else if (matrix[i][j]==9){
                    matrix[i][j]=7;
                }
                else if (matrix[i][j]==6){
                    matrix[i][j]=3;
                }
            }
        }
        for (int i = 0 ;i<rows;i++){
            for (int j =0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
    
}
