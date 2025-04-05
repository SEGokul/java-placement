import java.util.Scanner;
public class Evenodd{
public static void main (String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number:");
int num = scanner.nextInt();
if (num%2==0){
System.out.print(num+" "+"Even");
}
else {
System.out.print(num+" "+"Odd");
scanner.close();
}
}
}