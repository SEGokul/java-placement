import java.util.ArrayList;
public class Rangeofprimenumber {
    public static void main (String args []){
        int start=10;
        int end = 30;
        ArrayList<Integer> primenumber = new ArrayList<>();

        for (int i =start ;i<end ;i++){
            
            if ((i %2!=0)&&(i%3!=0)&&(i%i==0)&&(i%5!=0)){
                if (primenumber.add(i)){
                    System.out.print(i+" ");
                }
            }
        }
        for (int i = 0 ; i<primenumber.size();i++){
          System.out.print(primenumber.get(i)+" ");
        }
    }
    
}
