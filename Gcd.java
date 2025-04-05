import java.util.ArrayList;
public class Gcd {
    public static void main (String args []){
    int number1= 24;
    int number2=36;
    int gcd = 0;
    ArrayList<Integer> divisors1 = new ArrayList<>();
    ArrayList<Integer>divisors2= new ArrayList<>();
    ArrayList<Integer>commondivisor= new ArrayList<>();
    for (int i =1;i<=number1;i++){
        if (number1%i==0){
            divisors1.add(i);
        }
    }
    for (int j =1;j<=number2;j++){
        if (number2%j==0){
            divisors2.add(j);
        }}
    for (int i = 0 ;i<divisors1.size();i++){
        for (int j =0;j<divisors2.size();j++){
            if (divisors1.get(i)==divisors2.get(j)){
              commondivisor.add(divisors1.get(i));
            }}}
    for (int i =0;i<commondivisor.size();i++){
        if (commondivisor.get(i)>gcd){
            gcd=commondivisor.get(i);
        }
    }
    System.out.println(gcd);
}
}
