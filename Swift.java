import java.util.Scanner;

class Swift{

public static boolean swift(int num){

int a = num>>1;

int b = a<<1;

if (num!=b){return false;}

return true;} 
 


public static void main (String args[]){

Scanner scanner = new Scanner (System.in);

System.out.print("Enter the number :  ");

int num = scanner.nextInt();

if (swift(num)){System.out.print("Even");}

else {System.out.print("Odd");}
}
}