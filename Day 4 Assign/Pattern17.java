class Pattern17{
      public static void main (String args[])
      {
         int rows = 5;

         for(int i=1; i<=rows; i++){
             int number = 1;   
           
            for(int j=1; j<=i; j++){
             
               System.out.print(number);

               if(j<i){
               System.out.print("*");
             }
                number += 2;
            }
              System.out.println();
         }
      }
  }