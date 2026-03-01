import java.util.Scanner;
  
   class PrintMultiple{
      
       public static void main(String args []){

         Scanner in = new Scanner(System.in);

         System.out.print("Enter a number :");
         int n = in.nextInt();

       for(int i=1; i<=n; i++){

           if(i % 3 ==0){
                System.out.println(i+" ");
          }

        }
     }
}
    