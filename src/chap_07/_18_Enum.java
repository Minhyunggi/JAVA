package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 (Enum)
        // 달력 : JAN , FEB ...
        // 옷 사이즈 : S, M, L, XL ...
        // OS 종류 : WIN10, WIN11, MAC ...
        // 해상도 : HD, FHD , UHD ...

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);
        resolution = Resolution.UHD;

        System.out.print("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }
        // 문자열로부터 값을 가져와서 열거형으로 바꿔주는작업
        resolution = Resolution.valueOf("FHD");
        System.out.println(resolution);
        //for 문으로 열거형값을 알고싶을때
        for (Resolution myRes : Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }
        System.out.println("----------------");
        for (Resolution myRes :
                Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }
    }
}

enum Resolution {
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}