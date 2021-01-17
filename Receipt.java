package sist.com.inter.test;

public class Receipt {
    
    public static void main(String[] args) {
        
        Vicycle vicycle = new Vicycle();
        Information info = new Vicycle();
        InformationDetail infoDetail = new Vicycle();
        
        // ��ü ���� Ȯ�� �� ����
        vicycle.show(200000, "���̺긮�� ������");
        vicycle.buy(100000, "���̺긮�� ������");
        vicycle.goodsDetail();
        
        // �Ϲ� ���� - ����
        info.show(200000, "���̺긮�� ������");
        info.buy(100000, "���̺긮�� ������");
        
        // �� ���� - ����
        infoDetail.goodsDetail();
    }
}
 
 
class Vicycle implements Information, InformationDetail {
    
    @Override
    public void show(int price, String name) {
        System.out.println("�� ��ǰ �̸��� " + name + "�̸� ������ " + price + "�� �Դϴ�. ");
    }
    
    @Override
    public void buy(int price, String name) {
        System.out.println("�� ��ǰ �̸��� " + name + "�̸� " + price + "���� �����߽��ϴ�.");
    }
 
    @Override
    public void goodsDetail() {
        // TODO Auto-generated method stub
        System.out.println("������ : �Ｚ");
        System.out.println("ǰ�� : ��ȣ");
        System.out.println("�𵨸� : abc");
    }
}
 
public interface Information {
    
    public void show(int price, String name);
    public void buy(int price, String name);
}
 
 
public interface InformationDetail {
    
    public void goodsDetail();
}
