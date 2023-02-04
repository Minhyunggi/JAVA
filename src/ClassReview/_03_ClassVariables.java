package ClassReview;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동으로 신고 기능 개발 여부
        System.out.println(" - 개발 전 -");
        System.out.println(b1.modelName + "자동 신고 기능: " + b1.canAutoReport);
        System.out.println(b2.modelName + "자동 신고 기능: " + b2.canAutoReport); // 클래스 변수는 b1.canAutoReport 같은방식이아니라 클래스이름.클래스변수 로 하는걸 권장
                                                                                       // 때문에 BlackBox.canAutoReport 로 호출한것
        System.out.println("모든 블랙박스 제품 자동 신고 기능: " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true;
        System.out.println(" - 개발 후 -");
        System.out.println("모든 블랙박스 제품 자동 신고 기능: " + BlackBox.canAutoReport); // 인스턴스변수처럼 하나씩 지정해주는게아니라 공통적으로 한번에 교체할것이 있을거같으면 클래스변수로 지정


    }
}
