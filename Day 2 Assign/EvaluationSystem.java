class EvaluationSystem{
  
     public static void main(String args[]){
   
      int math = 67;
      int science = 95;
      int history = 90;
     
      
     int avg = (math+ science+ history)/3;
   
        System.out.println("Average mark :" + avg);
   
      if(avg >= 90)
      { 
          System.out.println("Grade : A");
      }
      
      else if(avg > 70)
      {
          System.out.println("Grade : B");
      }
  
      else if(avg > 50)
      {
          System.out.println("Grade : C");
      }
  
      else if(avg > 30)
      {
          System.out.println("Grade : D");
      }
    
      else
      {
          System.out.println("Fail");
      }
    }
}