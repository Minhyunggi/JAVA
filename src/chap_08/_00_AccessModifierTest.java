package chap_08;
// import chap_07.* 은 챕터7번에있는 모든 클래스를 가져다 쓰겠다는뜻
import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
    }
}
