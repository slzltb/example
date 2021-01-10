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
			      System.out.println("번호 : "+gradestores[i].getNum()+" 이름 : "+gradestores[i].getName()+" 국어 : "+gradestores[i].getKor()+" 영어 : "+gradestores[i].getEng()+" 수학 : "+gradestores[i].getMath());
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
		      System.out.println("1.성적 입력  2.성적 조회 3.등수 조회  4.학점 조회 5.전체 조회");
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



//성적처리
//번호 이름 국어 영어 수학 총점 평균 등수 학점