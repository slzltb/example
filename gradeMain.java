package sist.com.homework;

import java.util.Scanner;
import sist.com.homework.gradestore;

public class gradeMain {

	Scanner scanner = new Scanner(System.in);
	
	gradestore[]gradestores=new gradestore[5];//[][][][][]
	   int cnt=gradestores.length;
	   
	   public void write() {
		   gradestore gradestores=new gradestore();

		      System.out.println("Num : ");
		      gradestores.setNum(scanner.nextInt());
		      System.out.println("Name : ");
		      gradestores.setName(scanner.next());
		      System.out.println("Kor : ");
		      gradestores.setKor(scanner.nextInt());
		      System.out.println("Eng : ");
		      gradestores.setEng(scanner.nextInt());
		      System.out.println("Math : ");
		      gradestores.setMath(scanner.nextInt());
		     
		   }
		   
	   public void List() {
		   for (int i = 0; i < cnt; i++) {
			      System.out.println("��ȣ : "+gradestores[i].getNum()+" �̸� : "+gradestores[i].getName()+" ���� : "+gradestores[i].getKor()+" ���� : "+gradestores[i].getEng()+" ���� : "+gradestores[i].getMath());
			     }
	   }
	   public void rankfind() {
		   
	   }
	   public void gradefind() {
		   
	   }
	   public void totalList() {
		   
	   }
	
	   
	   public void menu() {
		      while(true) {
		      System.out.println("1.���� �Է�  2.���� ��ȸ 3.��� ��ȸ  4.���� ��ȸ 5.��ü ��ȸ");
		      switch (scanner.nextInt()) {
		      case 1:
		         write();
		         break;
		      case 2:
		         List();
		         break;
		      case 3:
		         rankfind();
		         break;
		      case 4:
		         gradefind();
		         break;
		      case 5:
		         totalList();
		         break;
		   
		      default:
		         break;
		      }
		      }
		   }
	   
	public static void main(String[] args) {
		
		gradeMain c=new gradeMain();
		c.menu();
	}
	
}



//����ó��
//��ȣ �̸� ���� ���� ���� ���� ��� ��� ����