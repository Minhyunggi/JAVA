package InterfaceRecap.Camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    //추상 메소드 , 구현해야 하는 메소드
    public abstract void showMainFeature();
}
