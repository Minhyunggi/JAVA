package chap_07.camera;

public final class ActionCam extends Camera {
    public final String lens = "광각렌즈"; // final 은 그냥 이 값을 사용하도록 못박아버리는작업
    public ActionCam() {
        super("액션 카메라");
    }

    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "로 촬영한 멋진 비디오를 제작합니다.");
    }
}
