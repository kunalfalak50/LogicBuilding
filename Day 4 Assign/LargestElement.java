import java.util.Scanner;

   class LargestElement{
   
      public static void main(String args[])
      {
         Scanner in = new Scanner(System.in);
         
           int[] num = new int[5];
          System.out.println("Enter the Five number : ");
              
             for(int i=0; i < 5; i++){
                   num[i] = in.nextInt();
         }
         int largest = num[0];
            
              for(int i=1 ; i<5; i++){
                   if(num[i] > largest){ 
                     largest= numbers[i];
                     
                }
             }  
                    
             System.out.println("Largest element is :"+  largest);
       }
 }

             
  

