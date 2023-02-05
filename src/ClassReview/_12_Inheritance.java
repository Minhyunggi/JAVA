package ClassReview;

import ClassReview.chap_08.camera.Camera;
import ClassReview.chap_08.camera.FactoryCam;
import ClassReview.chap_08.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속 , 하나의 부모한테만 상속 가능
        // 상속은 FactoryCam , SpeedCam 의 부모님 Camera 에 중복되는부분을 자식클래스에서 지우고 클래스이름을 짓는곳 뒷부분에 extends Camera 를 붙여주면된다. , name 변수도 지우고 생성자부분의 this.name 으로 상속받을수있음
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
