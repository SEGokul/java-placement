import java.util.Scanner;
class Harshad {

public static boolean harshad (int num){

int temp = num;
int sum = 0;

while (num>0){
int lastdigit = num%10;
sum=lastdigit+sum;
num=num/10;
}

num=temp;
System.out.println(num);
System.out.println(sum);
if (num%sum==0){
return true;
}
else {return false;}
}

public static void main (String args[]){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to verify Harshad: ");
int num = scanner.nextInt();

if (harshad(num)){ System.out.print(num+ " "+"Its is Harshad ");}

else { System.out.print(num+ " "+"Its is not Harshad ");}

}

}