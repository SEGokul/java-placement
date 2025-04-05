import java.util.ArrayList;
public class Strongseries{
    static ArrayList<Integer> lastdigit (int n){
     ArrayList<Integer> lastdigitholder = new ArrayList<>();
      while (n>0){
        int last = n%10;
        lastdigitholder.add(last);
        n=n/10;
      }
      return lastdigitholder;

    }
   static int factorial (int n ){
    if (n==0){
        return 1;}
    return n*factorial(n-1);
     }
public static void main (String args [])
{int sum = 0;
int number = 145;
ArrayList<Integer> hold = lastdigit(number);
for (int i =0;i<hold.size();i++){
    sum = sum +factorial(hold.get(i));
}
System.out.println(sum);
}

}

 