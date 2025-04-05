import java.util.Scanner;

class Fibonocci {

public static int fibo (int n){ 
if (n==0){return 0;}

else if (n==1){return 1;}


return fibo(n-1)+fibo(n-2);
}

public static void main (String args[]){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to verify Fibonocci: ");
int num = scanner.nextInt();
 
System.out.print("Fibo value of  "+num+" is " +fibo(num));

}

}