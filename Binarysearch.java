public class Binarysearch {
    public static int binary (int arr[], int target,int start , int end  ){
        
        while (start<=end){
            
                int mid = start+(end - start)/2;
                if (arr[mid] == target){
                    return mid;
                    
                }
                else if (arr[mid]< target){
                     start = mid +1;
                }
                else {
                    
                    end = mid - 1 ; 
                }
            }
        
        return -1; 
    }
    public static void main (String args[]){
      int arr [] = {1,3,5,6};
      int target = 11;
      int start = 0 ; 
      int  end = arr.length-1;
      System.out.println(binary(arr, target, start, end));

    }
}
