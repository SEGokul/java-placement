public class Bubblesort {
    public static int Search (int num [],int target ){
        int temp = 0 ; 
        int value = 0 ;
        for (int i = 0 ; i<num.length;i++){
           for (int j = 0 ; j< num.length-1-i;j++){
           if (num[j]>num[j+1]){
            temp = num[j];
            num[j]=num[j+1];
            num[j+1]=temp;
           }
           }
        }
        for (int i = 0 ; i<num.length;i++){
            System.out.print(num[i]);
        }System.out.println();
        for (int i = 0 ;i<num.length;i++){
            if (num[i]==target){
                value = i;
                break;
            }
        } return value;

    }
    public static void main (String args []){
        int arr[] = {3,5,2,1};
        int target = 5;
        System.out.print(Search(arr, target ));
    }
}
