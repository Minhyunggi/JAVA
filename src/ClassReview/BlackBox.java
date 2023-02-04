package ClassReview;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    static boolean canAutoReport = false; // 스태틱이 붙으면 클래스변수 , 자동신고기능

    void autoReport() {
        if(canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if(type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        } return 0;
    }
        // showDateTime : 날짜정보 표시여부
        // showSpeed : 속도정보 표시여부
        // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날씨정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true,true,5); // 메소드 오버로딩 , 위의 메소드를 그대로 쓰는데 이것은 기본값을 정해주는것과같은느낌
    }
    static void callServiceCenter() {
        System.out.println("서비스센터(1588-0000) 로 연결합니다.");
        // 클래스변수와 마찬가지로 클래스메소드도 공통적인 기능이 필요한경우에 사용하면좋음
        // modelName 같이 객체를 이용해야 만들어지는 인스턴스변수는 static이 들어간 클래스메소드에서 사용불가능
        // canAutoReport 같이 클래스 변수는 여기서 사용하거나 변경이 가능함
    }
}
