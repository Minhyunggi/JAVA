package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        // 부모클래스의 recordVideo 메소드가 실행되고나서 자식클래스에서 사용하길 원하는 detectFire 가 실행됨
        // Super 를 통해서 부모클래스의 변수나 메소드를 호출할수있음
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("--------------");
        speedCam.takePicture();
    }
}
