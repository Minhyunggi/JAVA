package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        // 어레이리스트는 의자에 앉아있는사람 사이에 새로운사람이 들어가면 한칸씩밀리는듯한 느낌의 리스트
        // 링크드리스트는 사람들끼리 손을잡고 서있지만 그 사이에 들어가도 문제가없는 그런 느낌의 리스트
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("---------------");

        // 추가
        list.addFirst("서장훈"); // 0번째로 넣어버리기
        for (String s :
                list) {
            System.out.println(s);
        }
        System.out.println("---------------");
        list.addLast("김희철");
        for (String s :
                list) {
            System.out.println(s);
        }
        System.out.println("학생 추가 전 : " + list.get(1));
        list.add(1,"김영철");
        System.out.println("학생 추가 후 : " + list.get(1));
        System.out.println("학생 추가 후 : " + list.get(2));
        System.out.println("---------------");

        // 삭제
        System.out.println("남은 학생 수(제외 전) : " + list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수(제외 후) : " + list.size());

        // 처음 학생과 마지막 학생이 전학
        System.out.println("남은 학생 수(전학 전) : " + list.size());
        list.removeFirst(); // 처음데이터 삭제
        list.removeLast(); // 마직막데이터 삭제
        System.out.println("남은 학생 수(전학 후) : " + list.size());
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------");

        //수강권 양도
        list.set(0, "이수근");
        System.out.println(list.get(0));

        //확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }
        System.out.println("---------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }
        System.out.println("---------------");

        // 새로운 학기
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
        list.add("강호동");
        list.add("강호동"); // List 에서는 중복 허용

        Collections.sort(list); // 정렬
        for (String s : list) {
            System.out.println(s);
        }
    }
}
