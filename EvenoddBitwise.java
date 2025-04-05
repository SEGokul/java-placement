import java.util.Scanner;

class EvenoddBitwise{

public static void evenodd (int num){

if ((num&1)==0){
System.out.print("Even");
}

else {System.out.print("Odd");}}

public static void main (String args[]){

Scanner scanner = new Scanner (System.in);

System.out.print("Enter the number :  ");

int num = scanner.nextInt();

evenodd(num);


}

}