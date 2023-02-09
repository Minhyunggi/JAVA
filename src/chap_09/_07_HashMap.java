package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석",10);
        map.put("박명수" ,5);
        map.put("김종국" ,3);
        map.put("서장훈" ,15);
        System.out.println("총 고객 수 : " + map.size());
        System.out.println("---------------------------");

        // 조회
        System.out.println("유재석님의 포인트 : " + map.get("유재석")); // 10
        System.out.println("유재석님의 포인트 : " + map.get("박명수")); // 5
        System.out.println("유재석님의 포인트 : " + map.get("김종국")); // 3
        System.out.println("---------------------------");

        // 확인
        if (map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈" , ++point);
            System.out.println("서장훈님의 누적 포인트 : " + map.get("서장훈"));
        } else {
            map.put("서장훈",1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }
        System.out.println("---------------------------");

        // 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("---------------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 고객 수는 : " + map.size());
        }
        System.out.println("---------------------------");

        // 다시 고객이 찾아옴
        map.put("유재석",10);
        map.put("박명수" ,5);
        map.put("김종국" ,3);
        map.put("서장훈" ,15);

        // key 확인 , 해쉬맵도 순서 보장 안됨 , 중복 허용 안됨
        for (String key :
                map.keySet()) {
            System.out.println(key);
        }
        System.out.println("---------------------------");

        for (int value :
                map.values()) {
            System.out.println(value);
        }
        System.out.println("---------------------------");

        // key , value 함께 확인 하는법
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + " 포인트 : " + map.get(key));
        }
        System.out.println("---------------------------");

        // 맵 : 중복X , 순서X , 마지막으로 업데이트된 값이 들어감 , 순서를 보장하고싶은경우에는 LinkedHashMap 을 하면된다 , 해쉬셋이랑 같은경우
        map.put("김종국" , 10);
        map.put("김종국" , 30);
        map.put("김종국" , 20);
        for (String key : map.keySet()) {
            System.out.println("고객 이름 : " + key + " 포인트 : " + map.get(key));
        }
        System.out.println("---------------------------");
    }


}
