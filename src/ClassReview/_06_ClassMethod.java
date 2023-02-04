package ClassReview;

public class _06_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.callServiceCenter();

        BlackBox b2 = new BlackBox();
        b2.callServiceCenter();

        BlackBox.callServiceCenter(); // 위와 같이도 가능은하지만 "클래스" 메소드인만큼 클래스변수처럼 클래스명.메소드로하는게 맞음


    }
}
