package chap_07;

public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 넘버

    static int counter = 0; // 시리얼 번호를 생성해주는역할 ++
    static boolean canAutoReport = false; // 자동 신고 기능 , (static)을 붙이면 클래스변수

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }
    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본생성자 ▲위에꺼 동작하고나서 밑에 생성자 실행
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity + "GB 입니다");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else if(type == 2) {
            return 1;
        }
        return 10;
    }

        // showDateTime : 날짜정보표시여부
        // showSpeed : 속도정보표시여부
        // min : 영상 기록단위 (분)
    void recode(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다");
    }
    void recode() { // 스태틱이 붙지않은건 인스턴스 메소드
        recode(true,true,5); // 위의 레코드 메소드에 이 기본값들을 넣어주는행위(_05_파일에서 별도로 지정하지않은 알규먼트를 이것으로 대체)
    }

    static void callServiceCenter() { // 스태틱이 붙은건 클래스메소드 공통적으로 계속 지속될거같은것에 스태틱붙이기 , 스태틱에선 스태틱으로만들걸 끌고와서 사용할수있지만 인스턴스는 가져와서 사용할수없음.
        System.out.println("서비스센터(1588-0000)으로 연결합니다");
    }

    void appendModelName(String modelName) { // 인스턴스변수하고 전달받은 파라미터 변수와 이름이같다면 인스턴스변수앞에 this를 넣어서 다른게 구분할수있다.
        this.modelName = this.modelName + modelName;
    }

    // Getter & Setter
    String getModelName(){
        return modelName;
    }
    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }
    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
