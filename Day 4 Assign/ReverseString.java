import java.util.Scanner;
class ReverseString{

      public static void main(String args[]){
     
      Scanner in = new Scanner(System.in);
     
       System.out.println("Enter name");
        
        String str = in.nextLine();

       
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        
        System.out.println("Reversed string: " + reverse);

        
    }
}