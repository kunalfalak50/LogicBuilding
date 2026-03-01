import java.util.Scanner;
class MorningMsg{
  
         public static void main(String args[]){
             
          int i;
          Scanner in = new Scanner(System.in);
      
             System.out.println("Enter the number");
                 
                 i = in.nextInt();

          if(i<12)

           {
               System.out.println("Good morning");
           }

          else {
               System.out.println("Good Afternoon");
            }
       }
}