public class Spirail {
    public static void main (String args []){
        int matrix[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0 ;i<rows;i++){
            for (int j = 0 ; j<columns ; j++){
                if (i==0||j==columns-1){
                    System.out.print(matrix[i][j]+" ");
                }
                else {
                    continue;
                }
            }
        }

        for (int i = 2 ; i<rows;i++){
            for (int j = i-1 ; j >=0 ; j--){
                if (i == 2){
                    System.out.print(matrix[i][j]+" ");
                } 
            }
        }

        for (int i = 1;i<rows;i++){
            for(int j = 0;j<=1 ;j++){
                if (i==1){System.out.print(matrix[i][j]+" ");}
                
            }
        }

    }
}
