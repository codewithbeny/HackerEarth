import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int sh=sc.nextInt();
        int sm=sc.nextInt();
        int eh=sc.nextInt();
        int em=sc.nextInt();
        int sum=0;
       if(eh>=sh){
        sum=(eh*60+em)-(sh*60+sm);

        }

      System.out.println(sum/60+" "+sum%60);

       }



    }
    
}
