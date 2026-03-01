import java.util.Arrays;
import java.util.Scanner;


class BinarySearch
{
   public static void main(String args[]){

       Scanner in = new Scanner(System.in);
      
        int[] numbers = new int[5];

      System.out.print("Enter the Five integers: ");
        
      for(int i =0; i <5; i++)
      {
         
         numbers[i] = in.nextInt();
         
      }
          Arrays.sort(numbers);

          System.out.println("Enter number to search:");

          int searchNumber = in.nextInt();

           int index = Arrays.binarySearch(numbers,searchNumber);
        
           if(index >=0){
               System.out.println("Found :" + index);
           }
          else {
               System.out.println("Not Found");
            }
        
       }
}
     