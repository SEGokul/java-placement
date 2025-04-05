public class Assessment12 {
    public static void main(String args[]) {
        int matrix[][] = {
            {5, 4, 7},
            {1, 8, 3},
            {9, 6, 2}
        };
        int rows = matrix.length;
        int columns = matrix[0].length;
        int temp;
        int arr[] = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[index++] = matrix[i][j];
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { 
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        index = 0; 
        int sortedMatrix[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sortedMatrix[i][j] = arr[index++]; 
            }
        }

        System.out.println("Sorted 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sortedMatrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
