import java.util.Scanner;
import java.util.Arrays;

class SortAscending
{
   public static void main(String args[]){

       Scanner in = new Scanner(System.in);
      
        int[] num = new int[5];
      System.out.print("Enter the Five integers: ");
      for(int i =0; i <5; i++)
      {
         num[i] = in.nextInt();
      }
       Arrays.sort(num);
     
       System.out.print("Sorted array in ascending order :");
            for (int i=0; i<5;i++)
          {
               System.out.println(num[i]+ " ");
           }
       }
}
     

