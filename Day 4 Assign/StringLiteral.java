class StringLiteral{

 public static void main(String args[]){
  
          String s1 = new String("CDAC");
	  String s2 = new String("CDAC");
           String s3 = new String("kunal");

          System.out.println("Both variables point to the same object :"+ (s1.equals(s2) ));
   }
}