import java.util.Scanner;
class Prime {

public static Boolean prime(int num){

if (num==2){return true;}

else if (num%2==0){return false;}

else if (num<2){return false;}

else {

for (int i = 3;i*i<=num;i=i+2){
if (num%i==0){return false;}
}

}

return true;}

public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to verify Prime or not: ");
int num = scanner.nextInt();

if (prime(num)){System.out.print(num+ " "+"Its is prime ");}

else {System.out.print(num+ " "+"It is not a  prime ");}

}

}