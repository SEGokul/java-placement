public class Binarytodecimal {
  public static int decimal (String str){
      int power = 1 ; 
      int deci = 0 ;
      for (int i = str.length()-1;i>=0;i--){
        char bit = str.charAt(i);
        if (bit == '1'){
            deci = deci+power;
        }
        power = power*2;
      }

  return deci;}

  public static void main (String args []){
    String str ="1011";
    System.out.println(decimal(str));
  }
 }
