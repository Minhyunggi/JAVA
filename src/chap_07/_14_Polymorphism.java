package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 ( 학생은 사람이다. Student is a person )
        // class Teacher extends Person : 선생님 ( 선생님은 사람이다. Teacher is a person )

        // 아래와 같이 부모클래스가 있으면 부모클래스로 통일시킬수있음
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam :
                cameras) {
            cam.showMainFeature();
        }

        System.out.println("-----------");
        // 아래의 메소드들은 부모클래스로 Camera라는 이름의 부모클래스로 정의했기때문에 개개인의 메소드는 사용 불가능
        // factoryCam.detectFire();
        // speedCam.checkSpeed();
        // speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }
        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }
        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)(SpeedCam) speedCam).recognizeLicensePlate();
        }
    }
}
