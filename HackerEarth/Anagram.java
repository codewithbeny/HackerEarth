/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int test=sc.nextInt();
       while( test-->0){
            String c=sc.next();
            String d=sc.next();
            int sum=0;
            int a[]=new int[26];
            int b[]=new int[26];
            for(int i=0; i<c.length()||i<d.length();i++){
               if(i<c.length()){
              a[c.charAt(i)-97]++ ;

               }
               if(i<d.length()){
              b[d.charAt(i)-97]++ ;
               }
            }
            for(int j=0;j<26;j++){
             sum+=Math.abs(a[j] - b[j]);
            }
            System.out.println(sum);
        }

    }
}
