import java.util.Scanner;

class Primerange {

public static void prime(int num){

for (int i = 1; i<=num;i++){

int count = 0;

for (int j =2;j<i;j++){

if ((i%j)==0){
count = count + 1;
}
}
if ((count==0)&&(i>1)){System.out.println(i);}

}}

public static void main (String args[]){

Scanner scanner = new Scanner (System.in);

System.out.println("Enter the number range :  ");

int num = scanner.nextInt();

prime(num);


}

}