
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int x=0;
       int y=0;
       String cmd=sc.next();
       for(int i=0;i<cmd.length();i++){
           char a=cmd.charAt(i);
           if(a=='L'){
              x=x-1; 
           }else if(a=='R'){
               x=x+1;
           }else if(a=='U'){
               y=y+1;
           }else if(a=='D'){
               y=y-1;
           }
       }
       System.out.println(x+" "+y);
    }
}
