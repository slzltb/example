package sist.com.exception;

public class ExceptionEx0 {
// 정수를 정수로 나눌 때 0으로 나누면 오류가 발생
// 0이 나올 예외 상황을 처리 - ArithmeticException문
// 오류 발생 여부 상관없이 무조건 실행 - finally문, finally는 생략 가능
	 public static void main(String[] args)  {
         int i = 100;
         try{
        	 for(int j=10;j>=0;j--) {// 100/10 100/9.. 반복문
             int k = i / j;
             try { // j가 짝수일 때 예외처리 - InterruptedException문
                 Thread.sleep(100);
                 if(j%2==1) {
                    throw new InterruptedException();
                 }
              } catch (InterruptedException e) {
            	  //System.out.println("예외처리된 j 값 ="+j); // 예외처리 되었는지 확인 출력
                  System.out.println(k);
              }

           }
         }catch(ArithmeticException e){ // 100/0 -> 예외 상황 처리
             System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
         }finally { // 무조건 실행
             System.out.println("오류가 발생하든 안하든 무조건 실행.");
         }
     }
	 }
