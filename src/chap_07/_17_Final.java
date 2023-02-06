package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final 은 상속할수 없도록 하거나 변경하고싶지않은 부분이있을때 적용
        ActionCam actionCam = new ActionCam();
//      actionCam.lens = "표준렌즈"; 액션캠 클래스에서 final 이 붙었기때문에 렌즈값을 변경할수 없음.
        actionCam.recordVideo();
        actionCam.makeVideo();
        System.out.println("---------------");
        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();
    }
}
