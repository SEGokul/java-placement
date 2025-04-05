public class Patttern {
 public static void main (String args []){
    int num = 4;
    for (int i = 1; i<=num ;i++){
        for (int j = 1;j<=i;j++){
            System.out.print(j);
        }
        for (int k = i+1 ; k<=num;k++){
            System.out.print("+");
        }
        for (int l = i;l<=i&l<=num;l++){
             System.out.print(l);
        }System.out.println();

    }
 }   
}
