package InterfaceRecap;

import InterfaceRecap.Camera.Camera;
import InterfaceRecap.Camera.FactoryCam;
import InterfaceRecap.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction), 보여줄건 보여주고 숨길건 숨기기위해 사용함
        // abstract
        // 추상클래스 (아직 완성되지 않은 클래스)
        // 추상메소드 (추상 클래스또는 인터페이스에서 사용가능한 껍데기만 있는 메소드)

//      추상클래스라 객체 생성 불가능  Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }
}
