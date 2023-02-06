package chap_07.camera;

// FactoryCam is a Camera (IS-A)
public class FactoryCam extends Camera { // 자식 클래스

    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라"); // 부모클래스의 생성자 접근
    }

    public void recordVideo() {
        super.recordVideo(); // 부모클래스의 recordVideo 메소드가 실행되고나서 자식클래스에서 사용하길 원하는 detectFire 가 실행됨
        detectFire();
    }
    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
