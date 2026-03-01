import java.util.Scanner;

class PrintElement{
   
      public static void main(String args[]){
   
           Scanner in = new Scanner(System.in);
     
           int[] numbers = new int[5];
  
           System.out.println("Enter the 5 numbers");
       
             for(int i=0; i < numbers.length; i++){
                 numbers[i] = in.nextInt();
             }
               System.out.println("you entered: ");
              
              for(int num : numbers){
                 
                System.out.println(num);
               }
         }
   }

   
             
              