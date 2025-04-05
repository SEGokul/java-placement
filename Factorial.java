import java.util.Scanner;
class Factorial{

public static int fact (int num){
int start = 1;

for (int i = 1;i<=num;i++){
start = start*i;
}

return start;}

public static void main(String args[]){
Scanner scanner = new Scanner (System.in);
System.out.print("Enter a number to find the factorial:");
int num = scanner.nextInt();
System.out.print(fact(num));
scanner.close();
}

}