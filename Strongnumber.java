import java.util.Scanner;

class Strongnumber{



public static int  strong(int num){

int sum = 0 ;


while (num>0){
int lastdigit = num%10;
sum = sum+fact(lastdigit);
num=num/10;
}

return sum;}

public static int fact (int num){
 int mul = 1;

for (int i=1;i<=num;i++){
   mul = i*mul;}
return mul;}



public static void main (String args []){

Scanner scanner = new Scanner (System.in);

System.out.println("Enter the number :  ");

int num = scanner.nextInt();

int value = strong(num);

System.out.println(value);
}
}