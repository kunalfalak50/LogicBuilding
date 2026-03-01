import java.util.Scanner;

   class AverageElement{
   
      public static void main(String args[])
      {
         Scanner in = new Scanner(System.in);
         
           int[] num = new int[5];
           int sum = 0;
          System.out.println("Enter the Five number : ");

       //input
       for(int i=0; i<num.length;i++)
        {
            num[i]= in.nextInt();
        }

        for(int avg : num){
         sum += avg;
        }
         
        double avg =(double) sum /num.length;
         System.out.println("Averga is :"+ avg);
  }
}
              
             
