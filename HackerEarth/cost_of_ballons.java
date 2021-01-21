/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc =new Scanner(System.in);
      
      int n=sc.nextInt();
      for(int j=0;j<n;j++){
      int a=0;
      int b=0;
      
     
      
      int cost_of_green=sc.nextInt();
      int cost_of_purple=sc.nextInt();
      // Enter no of test Cases
      int p=sc.nextInt();
      for(int i=0;i<p;i++){
          int first=sc.nextInt();
          int second=sc.nextInt();
          a=a+first;
          b=b+second;
          
      }if(a>b){
          if(cost_of_green>cost_of_purple){
           System.out.println(a*cost_of_purple+b*cost_of_green);
          }else{
          System.out.println(a*cost_of_green+b*cost_of_purple); 
          }
          
      }else{
          if(cost_of_green>cost_of_purple){
           System.out.println(b*cost_of_purple+a*cost_of_green);
          }else{
          System.out.println(b*cost_of_green+a*cost_of_purple); 
          } 
      }
      }

    }
}
