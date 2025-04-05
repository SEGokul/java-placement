public class longnumber {
    static String large(String num1, String num2) {
        String result = "";  
        int carry = 0;  
        
        int i = num1.length() - 1;  
        int j = num2.length() - 1;  

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = 0;
            int digit2 = 0;

            if (i >= 0) {  
                digit1 = num1.charAt(i) - '0'; 
                i--;  
            }

            if (j >= 0) {  
                digit2 = num2.charAt(j) - '0';  
                j--;  
            }

            int sum = digit1 + digit2 + carry;  
            carry = sum / 10;  

            result = (sum % 10) + result;  
        }

        return result;
    }

    public static void main(String[] args) {
        String num1 = "9223372036854775807";  
        String num2 = "10";  

        System.out.println(large(num1, num2));
    }
}
