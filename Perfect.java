import java.util.Scanner;

class Perfect {

public static boolean perfect(int num){

int sum = 0 ;

for (int i = 1;i<num;i++){
if (num%i==0){sum=sum+i;}
}

if (sum==num){
return true;
}

return false;}

public static void main (String args[]){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to verify Perfect: ");
int num = scanner.nextInt();

if (perfect(num)){ System.out.print(num+ " "+"Its is perfect number ");}

else { System.out.print(num+ " "+"Its is not perfect number ");}

}	

}