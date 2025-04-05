import java.util.ArrayList;
public class Chronicnumber {
 static ArrayList<Integer> abundant (int n ){
        ArrayList <Integer> factor = new ArrayList<>();
        for (int i =1;i<=n;i++){
            if (n%i==0){
                factor.add(i);
            }
        }
       return factor;
    }
static ArrayList <Integer> pronic (int n ){
    ArrayList<Integer> pro = new ArrayList<>();
    for (int i =1;i<=n;i++){
        if (n%i==0){
            pro.add(i);
        }
    } return pro;
}
    public static void main (String args []){
        int number = 12;int sum = 0;
        ArrayList<Integer> hold = abundant(number);
        for (int i =0 ; i<hold.size();i++){
            sum+=hold.get(i);
        }
 System.out.println (sum);
 ArrayList<Integer> pro1=pronic(number);
 int size = pro1.size();
    for (int i = 0 ;i<size;i++ ){
        if (i==5){break;}
        if ((pro1.get(i)-pro1.get(i+1)==-1)&&((i*i+1)==number)){
            System.out.println(i+" "+i+1);
        }
    }

    }
    
}
