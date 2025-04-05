import java.util.Scanner;
public class Ntimes {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String input = scanner.nextLine(); 
        scanner.close(); 
        
        String output = expandText(input); 
        System.out.println("Expanded Output: " + output); 
    }

    public static String expandText(String input) {
        StringBuilder result = new StringBuilder(); 
        StringBuilder tempText = new StringBuilder(); 
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); 

            if (Character.isLetter(ch)) {
                tempText.append(ch); 
            } else if (Character.isDigit(ch)) {
                int repeatCount = Character.getNumericValue(ch); 
 
                for (int j = 0; j < repeatCount; j++) {
                    result.append(tempText);
                }
                tempText.setLength(0); 
            }
        }
        
        result.append(tempText);

        return result.toString(); 
    }
}


