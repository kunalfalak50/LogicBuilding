import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        int vowelCount = 0;

       
        str = str.toLowerCase();

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        
        System.out.println("Total number of vowels: " + vowelCount);

        
    }
}