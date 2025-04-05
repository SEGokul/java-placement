public class Decimaltobinary {
  public static String binary(int num){
   int binaryarray []=new int [1];
   int size = 0 ;
   while (num>0){
    if (size==binaryarray.length){
      int newarray[]=new int  [binaryarray.length*2];
      System.arraycopy(binaryarray,0,newarray,0,size);
      binaryarray=newarray;
    }
    binaryarray[size]= num%2;
    size++;
    num=num/2;
   }
   StringBuilder bin = new StringBuilder();
   for (int i = size-1;i>=0;i--){
    bin.append(binaryarray[i]);
   }
  return bin.toString();}
  public static void main (String args []){
    int num = 10;
    System.out.println(binary(num));
  }
}
