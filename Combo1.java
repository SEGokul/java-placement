public class Combo1 {
    public static int arr[] com(int arr[]){
      if 
    }
 public static void main (String args []){
    int arr[]={2,3,5};
    int target = 7;
    int value = 0 ; 
    for (int i = 0 ; i<arr.length;i++){
        for (int j = 0 ;j <arr.length;j++){
            if (arr[i]+arr[j]==target){
            System.out.print("("+arr[i]+" "+arr[j]+")");
            }
            else if (arr[i]+arr[i]+arr[j]==target){
                System.out.print("("+arr[i]+" "+arr[i]+" " +arr[j]+")" );
            }
        }System.out.println();
    }
 }   
}
