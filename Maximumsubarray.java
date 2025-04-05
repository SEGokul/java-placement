public class Maximumsubarray {
    public static int maximum(int arr[]){
     
        int firstmax = arr[0];
        int currentmax = arr[0];

        for (int i = 1;i<arr.length;i++){
            if(currentmax+arr[i]>arr[i]){
                currentmax=currentmax+arr[i];
            }
            else {
                currentmax=arr[i];
            }
            if (currentmax>firstmax){
                 firstmax=currentmax;
            }
        }
    return firstmax;}

    public static void main (String args[]){
        int num[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximum(num));
    }
}
