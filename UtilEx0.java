package sist.com.util2;

import java.util.Arrays;

public class UtilEx0 {
   
   public void substr() { // substring,split 문자열 자르기
      String str = "Substring Test 2021-01-20";
      String test1=str.substring(10);
      String test2=str.substring(10,14);
      String test3=str.substring(10,str.length()-5);
      String test4=str.substring(str.indexOf("T"));
      String[] test5=str.split(" ");
      String[] test6=str.split(" ",2);
      String[] test7=str.split(" ",3);
      
      System.out.println(test1); // Test 2021-01-20
      System.out.println(test2); // Test
      System.out.println(test3); // Test 2021-
      System.out.println(test4); // Test 2021-01-20
      System.out.println(Arrays.toString(test5)); // [Substring, Test, 2021-01-20]
      System.out.println(Arrays.toString(test6)); // [Substring, Test 2021-01-20]
      System.out.println(Arrays.toString(test7)); // [Substring, Test, 2021-01-20]
   }
   
   public void StringBuffer() {
      
   }
   
   public void StringBuilder() {
      
   }
   
   public void Calendar() {
      
   }
   
   public void Date() {
      
      
   }
   
   
   
   
   public static void main(String[] args) {
      UtilEx0 u =new UtilEx0();
      u.substr();
      u.StringBuffer();
      u.StringBuilder();
      
   }

}