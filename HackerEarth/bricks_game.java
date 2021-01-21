
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String result="";
      int r=1;
       while(true){
         if(n>0){
             n=n-r;
             result="Patlu";
         }  if(n>0){
               n=n-r*2;
             result="Motu";
         }
         if(n<=0){
             break;

         }
         r++;
       }
System.out.println(result);
    }
}