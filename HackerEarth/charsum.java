
import java.util.*;




class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     int k=0;
     char[] ch=str.toCharArray();

    for(int i=0;i<str.length();i++){

        k=k+(ch[i]-96);

    }

     System.out.println(k);

   }
}
