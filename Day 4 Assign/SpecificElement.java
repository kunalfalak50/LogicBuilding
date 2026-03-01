import java.util.ArrayList;
import java.util.Scanner;


public class SpecificElement
{
   public static void main(String args[]){

       Scanner in = new Scanner(System.in);
      
        Integer[] numbers = new Integer[5];

      System.out.println("Enter the Five integers: ");
      
      for(int i =0; i <5; i++)
      {
         
         numbers[i] = in.nextInt();
         
      }
      List<Integer>numberList = Arrays.asList(numbers);

        System.out.println("Enter number to search:");

        int searchNumber = in.nextInt();
        
           if(numberList.contains(searchNumber)){
               System.out.println("Found");
           }
          else {
               System.out.println("Not Found");
            }
        
       }
}
     