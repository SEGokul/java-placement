import java.util.Scanner;

class Automorphic {

public static boolean auto(int num){

int temp = num;
int square = num*num;

while (num>0){
if (num%10 != square%10){
return false;
}
num=num/10;
square=square/10;
}

System.out.println(num);
System.out.println(square);


return true;}

public static void main (String args[]){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to verify Automorphic: ");
int num = scanner.nextInt();

if (auto(num)){ System.out.print(num+ " "+"Its is Automorphic ");}

else { System.out.print(num+ " "+"Its is not Automorphic ");}

}

}