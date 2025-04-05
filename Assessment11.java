public class Assessment11 {
    public static void main (String args []){
        int matrix [][] = {{5,4,7},{1,8,3},{9,6,2}};
        int rows = matrix.length;
        int columns = matrix[0].length;
        int firstmax=0;
        int secondmax=0;
        int thirdmax=0;
        for (int i =0;i<rows;i++){
            for (int j =0;j<columns;j++){
                if (matrix[i][j]>firstmax){
                    thirdmax=secondmax;
                    secondmax=firstmax;
                    firstmax=matrix[i][j];
                }
                else if ((matrix[i][j]>secondmax)&&(matrix[i][j]!=firstmax)){
                    thirdmax=secondmax;
                    secondmax=matrix[i][j];
                }else if ((matrix[i][j]>thirdmax)&&(matrix[i][j]!=secondmax)){
                    thirdmax=matrix[i][j];
                }
 }
            }
            System.out.println("Firstmax " + firstmax);
            System.out.println("Secondmax " + secondmax);
            System.out.println("Thirdmax " + thirdmax);
        }
    }

