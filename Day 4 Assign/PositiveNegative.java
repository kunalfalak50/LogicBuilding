import java.util.Scanner;
  
 class PositiveNegative{
 
      public static void main(String args[]){
  
         Scanner in = new Scanner(System.in);
         int[] num =new int[6];
            int positiveCount=0;
             int negativeCount =0;
          System.out.println("Enter six number : ");
        
            for(int i =0; i<num.length; i++)
             {
                num[i] = in.nextInt();
             }
             
            for(int numbers : num){
                if(numbers > 0){
                     positiveCount++;
                       
                   }
                 else if (numbers < 0) {
                      negativeCount++;

                  }
              }
             System.out.println("Positive number  : "+ positiveCount);
              System.out.println("Negative number  : "+ negativeCount);
       }
}
          
   