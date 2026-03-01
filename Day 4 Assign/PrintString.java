import java.util.Scanner;

class PrintString{
   
      public static void main(String args[]){
   
           Scanner in = new Scanner(System.in);
     
           String[] names = new String[4];
  
           System.out.println("Enter the 4 names");
       
             for(int i=0; i < names.length ;i++){
                
           
                 names[i] = in.nextLine();
             }
             
              System.out.println("Name are entered:");
    
              for(String name: names){
                System.out.println(name);
              }
          }
      }