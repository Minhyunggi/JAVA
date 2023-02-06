package ClassReview;

import ClassReview.chap_08.camera.Camera;
import ClassReview.chap_08.camera.FactoryCam;
import ClassReview.chap_08.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

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

        System.out.println("----------------");
//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }
        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }
        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }
    }
}
