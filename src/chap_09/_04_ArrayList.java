package chap_09;

import java.util.ArrayList;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List , Set , Map)
        ArrayList<String> list = new ArrayList<>(); // list 라는 이름의 String 형태의 데이터를 보관할수있는곳

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회(인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println("--------------");

        // 삭제 ( 박명수씨가 이사 )
        System.out.println("신청 학생 수 ( 이사 전 ) : " + list.size()); // 5
        list.remove("박명수");
        System.out.println("신청 학생 수 ( 이사 후 ) : " + list.size()); // 4
        System.out.println(list.get(3));

        System.out.println("--------------");

        // 공간이 좁아서 선착순으로 했을때 뒤에서 두명이 빠져야됨
        System.out.println("남은 학생 수 (제외 전) : " + list.size()); // 4
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : " + list.size()); // 3

        System.out.println("--------------");
        
        // 순회 
        for (String s :
                list) {
            System.out.println(s); // 유재석 , 조세호 , 김종국
        }



    }
}
