package sist.com.inter.test;

public class Receipt {
    
    public static void main(String[] args) {
        
        Vicycle vicycle = new Vicycle();
        Information info = new Vicycle();
        InformationDetail infoDetail = new Vicycle();
        
        // 전체 정보 확인 후 구매
        vicycle.show(200000, "하이브리드 자전거");
        vicycle.buy(100000, "하이브리드 자전거");
        vicycle.goodsDetail();
        
        // 일반 구매 - 참조
        info.show(200000, "하이브리드 자전거");
        info.buy(100000, "하이브리드 자전거");
        
        // 상세 정보 - 제한
        infoDetail.goodsDetail();
    }
}
 
 
class Vicycle implements Information, InformationDetail {
    
    @Override
    public void show(int price, String name) {
        System.out.println("이 상품 이름은 " + name + "이며 가격은 " + price + "원 입니다. ");
    }
    
    @Override
    public void buy(int price, String name) {
        System.out.println("이 상품 이름은 " + name + "이며 " + price + "원에 구매했습니다.");
    }
 
    @Override
    public void goodsDetail() {
        // TODO Auto-generated method stub
        System.out.println("제조사 : 삼성");
        System.out.println("품질 : 양호");
        System.out.println("모델명 : abc");
    }
}
 
public interface Information {
    
    public void show(int price, String name);
    public void buy(int price, String name);
}
 
 
public interface InformationDetail {
    
    public void goodsDetail();
}
