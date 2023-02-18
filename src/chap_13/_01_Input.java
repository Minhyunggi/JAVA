package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in); // 인풋만들기
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        System.out.println("혈액형을 입력하세요");
        String bloodType = sc.next();
        System.out.println("키를 입력하세요");
        int height = Integer.parseInt(sc.next());
//        int height2 = sc.nextInt();
        System.out.println("몸무게를 입력하세요");
        double weight = Double.parseDouble(sc.next());
        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.nextLine(); // nextLine 은 한 문장을 원할때 사용하면됨

//        String lang = sc.next();  자바를 배웠어요 라고한다면 자바를이 들어가고 배웠어요만 남게되는데
//        sc.nextLine(); 을 해서 불필요한 남은단어를 지워줄수있음


        System.out.println("입력하신 정보는 다음과 같습니다.");
        System.out.println("이름 : " + name);
        System.out.println("혈액형은 : " + bloodType);
        System.out.println("키는 : " + height);
        System.out.println("몸무게는 : " + weight);
    }
}
