public class fibo {
    static int fibon (int n ){
        if (n==0) return 0;
        if (n==1) return 1;
        return fibon(n-1)+fibon(n-2); 
    }
    public static void main (String args []){
        int number = 10  ; 
       System.out.println(fibon(number));
       
    }
}
