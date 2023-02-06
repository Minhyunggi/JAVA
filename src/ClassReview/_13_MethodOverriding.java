package ClassReview;

import ClassReview.chap_08.camera.Camera;
import ClassReview.chap_08.camera.FactoryCam;
import ClassReview.chap_08.camera.SpeedCam;


public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기(재정의)
        // 사용하는 이유는 부모클래스의 메소드이름을 그대로 덮어씨우면서 부모와 자식간의 서로다른 동작을 할 수 있음.
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
