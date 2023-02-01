package chap_07;

public class _08_Constructor { // 생성자 , 객체가 생성될때 자동으로 호출되는메소드
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox("하양이","FHD",200000,"화이트");
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);


        System.out.println("---------------");
        BlackBox b2 = new BlackBox("까망이","UHD",300000,"블랙");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
    }
}
