public class Frequency {
    public static void main (String args[]){
        String str = "Helloh";
        str=str.toLowerCase();
        for (int i = 0 ; i< str.length();i++){
            char ch = str.charAt(i);
            int count = 0 ;
            boolean already = false ;
            for (int k = 0 ; k<i;k++){
              if (ch == str.charAt(k)){
                already = true; 
                break;
              }
            }
            if (already){continue;}
            for (int j = 0 ; j<str.length();j++){
                if (ch==str.charAt(j)){
                   count++;
                }
            }
            System.out.println(ch +":"+ count);
        }

    }
}
