package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        // 상속의 경우엔 중복되는것을 클래스마다 넣어줄필요없이
        // 부모클래스에만 중복할것을 넣고나서 자식클래스들은 만들어질때
        // public class FactoryCam extends Camera 와같이 extends Camera < Camera부분이 부모클래스
        // 하나의 부모클래스에게만 상속받을수있다 , 여러개 안됨
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
