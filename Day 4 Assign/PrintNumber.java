import java.util.Scanner;
class PrintNumber{

     public static void main(String args[]){
      Scanner in = new Scanner(System.in);
    
          System.out.print("Enter a Number is : ");
          int n;
          n = in.nextInt();
       for(int i=0 ; i<=9;i++){
      
            System.out.println((n+i));
       }
    }
}   