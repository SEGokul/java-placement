public class Roman {
    public static int convert(String s ){
        int total = 0 ; 
        int pre = 0 ; 
for (int i = s.length()-1 ; i>=0;i--){
 
    int value = cha(s.charAt(i));

    if (value<pre){
        total = total-value;
    }
    else {
        total = total + value;
    }
    pre = value ; 

}
    return total;    

    }
    public static int  cha (char ch ){
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return  50 ;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return  1000 ;
            default:return 0;
        }
    }
    public static void main (String args []){
        String str = "IV";
        System.out.println(convert(str));
    }
}