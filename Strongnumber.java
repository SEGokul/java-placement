public class Strongnumber {
    public static boolean isprime(int n){
        if (n<2)return false;
        for (int i =2;i<=Math.sqrt(n);i++){
            if (n%i==0)return false;
        }
        return true;

    }
    public static void prime(int l, int r ){
        for (int i =l;i<=r;i++){
            if (isprime(i)){
                System.out.print(i+ " ");
            }
        }
    }
    
    public static void main(String args []){
        int l =20; int r= 80;
        prime(l, r);

    }
}
