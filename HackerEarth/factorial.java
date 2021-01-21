/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int f=1;
      for(int i=1;i<=n;i++){
           f=f*i;
      }
      System.out.println(f);
    }
}
