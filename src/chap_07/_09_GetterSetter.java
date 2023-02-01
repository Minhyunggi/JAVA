package chap_07;

public class _09_GetterSetter { // 만일의상황에 대비해 최소한의 기본값을 정해두는 용도
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
//        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        // 행사 가격
        b1.price = -5000;
        System.out.println(b1.price);

        // 고객 문의
        System.out.println(b1.resolution);

        System.out.println("------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격" + b2.getPrice());
        System.out.println(b2.getResolution());
    }
}
