import java.util.Scanner;
class Neon {

public static boolean neon (int num){
 int square = num*num;
 int add = 0 ;


while (square>0){
int lastdigit = square%10;
add=lastdigit+add;
square=square/10;
}

if (add!=num){return false;}

return true;}

public static void main (String args[]){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to verify Neon: ");
int num = scanner.nextInt();

if (neon(num)){ System.out.print(num+ " "+"Its is neon ");}

else { System.out.print(num+ " "+"Its is not neon ");}

}
 


	


}