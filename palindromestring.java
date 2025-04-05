public class palindromestring{
    static String palindrome(String str , int start , int end ){
        if (start>=end) return "palindrome";
    
    if (str.charAt(start)!=str.charAt(end)) return "not a palindrome";
    return palindrome(str,start+1,end-1);}
    public static void main (String args []){
        String str ="ABCDCBA";
        int start = 0;
        int end = str.length()-1;
        System.out.println(palindrome(str,start,end));
    }
}