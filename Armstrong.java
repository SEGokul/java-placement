import java.util.Scanner;
class Armstrong{
public static int arm(int num){

int temp = num;
int count = 0 ;
int power = 1 ;
int sum = 0 ;

while(num>0){
count = count+1;
int lastdigit=num%10;
num=num/10;}

num=temp;

while(num>0){
power=1;
int lastdigit=num%10;

for (int i = 1;i<=count;i++){
power=lastdigit*power;
}
 
sum=sum+power;
num=num/10;}

return sum;}

public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to verify Armstrong: ");
int num = scanner.nextInt();
int value = arm(num);

if (value == num){
System.out.print(num+" "+"Its a armstrong");
}

else{
System.out.print(num+" "+"Its not a armstrong");
}

scanner.close();

}

}