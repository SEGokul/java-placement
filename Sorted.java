public class Sorted {
    public static int array(int arr[], int target ){
        int temp = 0 ; 
        int value = 0 ;
        int newarray []=new int [arr.length+1];
        for (int i = 0 ;i<arr.length;i++){
            for (int j = 0 ; j<newarray.length;j++){
                newarray[j]=arr[j];
                if (arr[j]==target){
                    value = j;
                    break;
                }
                else if (arr[j]>target){
                     temp = arr[j+1];
                     newarray[j+1]=arr[]
                           
                }
            }
         

        } 
    
    }
    public static void main (String args []){
        int arr []=  {1,3,4,5};
        int target = 6;
        System.out.println(array(arr,target));
    }
}
