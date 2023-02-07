package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.repoter.NormalReporter;
import chap_08.repoter.VideoReprter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();
        VideoReprter videoReprter = new VideoReprter();
        videoReprter.report();
        System.out.println("--------------");  

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();
        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("--------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReprter);

        factoryCam.detect();
        factoryCam.report();
    }
}
