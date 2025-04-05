import java.util.Scanner;

class Swap {

public static void  swap (int a , int b){

a=a^b;

b=a^b;

a=a^b;

System.out.print("a = "+ a);

System.out.print("b = "+ b);

}

public static void main (String args[]){

Scanner scanner = new Scanner (System.in);

System.out.print("Enter the first number :  ");

int num1 = scanner.nextInt();

System.out.print("Enter the second number :  ");

int num2 = scanner.nextInt();

swap(num1,num2);

}

}