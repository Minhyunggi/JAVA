package ClassReview.chap_08.camera;

public class SpeedCam extends Camera {

    public SpeedCam() {
        this.name = "과속단속 카메라";
    }
    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate() {
        // 번호판 인식
        System.out.println("차량 번호를 인식 합니다.");
    }

    @Override // 부모클래스를 오버라이드 하려고할때 annotation 이라는것 , 부모클래스에 오버라이드할것이없으면 에러발생
    public void showMainFeature() {
        System.out.println(this.name + " 의 주요 기능 : 속도 측정 , 차량 번호 인식");
    }
}
