package InterfaceRecap;

import InterfaceRecap.detector.Detectable;
import InterfaceRecap.detector.NormalDetector;
import InterfaceRecap.detector.VideoDetector;
import InterfaceRecap.reporter.NormalReporter;
import InterfaceRecap.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 추상클래스가 미완성된 클래스였다고하면은 인터페이스는 뼈대만 제공해주는구조
        // "단일"상속 (extends) 과 다름
        // 인터페이스는 같은 메소드 이름을 사용할것같은상황에서 서로 약간씩 다른 경우에 쓰면 좋음
        // 예 : public interface 카페 {
        //    void order(); // 음료 주문
        //    void make(); // 음료 제작
        //    void call(); // 주문 고객 호출
        //}
        // public class 카페_예1 implements 카페 {
        //    @Override
        //    public void order() {
        //        System.out.println("키오스크로 주문받습니다.");
        //    }
        //
        //    @Override
        //    public void make() {
        //        System.out.println("기계로 음료를 제작합니다.");
        //    }
        //
        //    @Override
        //    public void call() {
        //        System.out.println("진동벨로 안내합니다.");
        //    }
        //}
        //
        //public class 카페_예2 implements 카페 {
        //    @Override
        //    public void order() {
        //        System.out.println("직원분이 직접 주문받습니다.");
        //    }
        //
        //    @Override
        //    public void make() {
        //        System.out.println("직원분이 직접 음료를 제작합니다.");
        //    }
        //
        //    @Override
        //    public void call() {
        //        System.out.println("직원분이 직접 호출합니다.");
        //    }
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        NormalDetector normalDetector = new NormalDetector();
        normalDetector.detect();

        VideoDetector videoDetector = new VideoDetector();
        videoDetector.detect();
    }
}
