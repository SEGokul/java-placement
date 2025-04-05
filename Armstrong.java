import java.util.ArrayList;
public class Armstrong {
    public static void main (String args []){
//         Input: N = 153  
// Output: true  
// Explanation: 153 = (1^3) + (5^3) + (3^3) = 1 + 125 + 27 = 153  
 int input = 153;
 int input1=input;
 int count = 0;
 int sum=0;
 ArrayList <Integer>arr = new ArrayList<>();
 while (input>0){
    int lastdigit = input %10;
    arr.add(lastdigit);
    input=input/10;
    count++;
 }
for (int i =0;i<arr.size();i++){
   int value =  arr.get(i);
   int exponentialvalue = (int)Math.pow(value,count);
   
   sum=sum+exponentialvalue;
}
if (sum==input1){
    System.out.println("Its armstrong");}
else {
    System.out.println("Its not armstrong"); 
}


    }
}
