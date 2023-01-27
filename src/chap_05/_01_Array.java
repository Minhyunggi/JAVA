package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러개를 저장하는 여러개를 저장하는 연손된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + "하나"); // 아메리카노 하나
        System.out.println(coffeeRachel + "하나"); // 카페모카 하나
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요");

        // 배열선언 첫 번째 방법
//        String[] coffees = new String[4]; // 크기 4에 해당하는 스트링 배열

        // 배열선언 두 번째 방법
        // String coffees[] = new String[4];

//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카페치노";

        // 배열선언 세 번째 방법
        //String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열선언 네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        System.out.println("---------------");

        // 커피 주문
        System.out.println(coffees[0] + " 하나");
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소";
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요");
        System.out.println("---------------");
        // 다른 자료형?
        int[] i = {1,2,3};
        System.out.println(i[0]);

    }
}
