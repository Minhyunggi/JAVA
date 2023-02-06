package chap_07.camera;

public class SlowActionCam {
    public String name;
    public SlowActionCam(){
        this.name = "슬로우 액션 카메라";
    }

    public void makeVideo() {
        System.out.println("자체 개발한 비디오");
    }
    public void recordVideo() {
        // 동영상 녹화
        System.out.println(this.name + " : 동영상을 녹화합니다.");
    }
}
