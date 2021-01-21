
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
    
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    long product=1;
    int[] arr=new int[n];
    for(int i=0; i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int k=0; k<n;k++){
        product=(long)(product*arr[k])%(long)(Math.pow(10,9)+7);
    }
    System.out.println(product);
    }
}
