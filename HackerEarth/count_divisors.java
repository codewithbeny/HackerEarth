
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int l=sc.nextInt();
       int r=sc.nextInt();
       int k=sc.nextInt();
       int ans=0;
      for(int i=l;i<=r;i++){
       if(i%k==0){
           ans++;

       }
      }
      System.out.println(ans);
    }
}
