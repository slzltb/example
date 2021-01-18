package sist.com.exception;

public class ExceptionEx0 {
// ������ ������ ���� �� 0���� ������ ������ �߻�
// 0�� ���� ���� ��Ȳ�� ó�� - ArithmeticException��
// ���� �߻� ���� ������� ������ ���� - finally��, finally�� ���� ����
	 public static void main(String[] args)  {
         int i = 100;
         try{
        	 for(int j=10;j>=0;j--) {// 100/10 100/9.. �ݺ���
             int k = i / j;
             try { // j�� ¦���� �� ����ó�� - InterruptedException��
                 Thread.sleep(100);
                 if(j%2==1) {
                    throw new InterruptedException();
                 }
              } catch (InterruptedException e) {
            	  //System.out.println("����ó���� j �� ="+j); // ����ó�� �Ǿ����� Ȯ�� ���
                  System.out.println(k);
              }

           }
         }catch(ArithmeticException e){ // 100/0 -> ���� ��Ȳ ó��
             System.out.println("0���� ���� �� �����ϴ�. : " + e.toString());
         }finally { // ������ ����
             System.out.println("������ �߻��ϵ� ���ϵ� ������ ����.");
         }
     }
	 }
