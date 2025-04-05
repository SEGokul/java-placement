import java.util.Scanner;
class Palindrome{

public static boolean palin(int num){
int temp = num;
int reverse =0;

while (num>0){
int lastdigit = num%10;
reverse = reverse*10+lastdigit;
num = num/10;
}
//if block
if (reverse == temp){
return true;
}
else{return false;}
//if block ends

}// function ends 

public static void main (String args[]){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to verify Palindrome: ");
int num = scanner.nextInt();

if (palin(num)){System.out.print(num+ " "+"Its is palindrome ");}

else {System.out.print(num+ " "+"It is not a  palindrome ");}

}

}