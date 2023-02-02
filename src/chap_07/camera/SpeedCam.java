package chap_07.camera;

public class SpeedCam extends Camera { // 자식 클래스

    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }
    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }
    @Override // 오버라이드는 그냥 부모클래스에 한걸 복사 붙여넣기하고 기능을 수정하면 덮어씌우는느낌
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정 , 차량 번호 인식");
    }
}
