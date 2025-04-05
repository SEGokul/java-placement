
public class primerange {
    static boolean isprime(int n ){
        if (n<2)return false ;
        if (n==2||n==3)return true ;
        if (n%2==0)return false;
        for (int i =3;i*i<=n;i+=2){
         if (n%i==0){
            return false;}
        }return true;
    }
    public static void primeseries(int l , int r){
        for (int i = l ; i<=r ;i++){
            if (isprime(i)){System.out.print(i+ " ");}
        }

    }
    public static void main (String args []){
        int start = 20;int left = 50;
        primeseries(start,left);
        
        }
    }

