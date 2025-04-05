public class reversearray {
    static void reverse(int arr[],int start,int end ){
        if (start >=end ) return;
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr, start+1, end-1);
    }
    public static void main (String args[]){
        int arr []= {1,2,3,4,5};
        int start = 0;
        int end = arr.length -1;
        reverse (arr,start,end );
        printarray(arr);
    }
    static void  printarray (int arr[]){
        for (int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
