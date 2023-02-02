package chap_07;

public class BlackBoxRefurbish { // 하나의 파일에서 여러 클래스를 만들수있지만 public 이 들어가면 파일명이랑 클래스명이랑 같아야함
    public String modelName; // 모델명
    String resolution; // 해상도 , default 값은 앞에 따로 아무것도 안적어주면됨
    private int price; // 가격
    protected String color; // 색상
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
