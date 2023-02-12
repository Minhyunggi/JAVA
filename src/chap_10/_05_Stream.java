package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성

        //Arrays.stream
        int[] scores = {100,95,90,85,80};
        IntStream scoreStream = Arrays.stream(scores); //Arrays.stream(scores) 까지만 하고 컨트롤 알트 브이 하면 자동완성

        String[] langs = {"python" , "java" , "javascript", "c" , "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // Collection.stream()
        List<String> langlist = new ArrayList<>();
//        langlist.add("python");
//        langlist.add("java");
//        langlist.add("javascript");
//        langlist.add("c");
//        langlist.add("c++");
//        langlist.add("c#");
        langlist = Arrays.asList("python" , "java" , "javascript", "c" , "c++", "c#"); // 위의 add 대신에 이방법 사용가능
        System.out.println(langlist.size());
        System.out.println("-------------------");
        Stream<String> langListStream = langlist.stream();

        //Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter , map , sorted , distinct , skip ...
        // 최종 연산 (Terminal Operation) : count , min , max , sum , foreach , anyMatch, allMatch...
        // 스트림은 매번 데이터를 소진하기떄문에 변수에놓고 사용하지않고 실습한다

        // 90 점 이상인 점수만 출력 score 에서
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        System.out.println("-------------------");

        // 90 점 이상인 사람의 수
        long count = Arrays.stream(scores).filter(x -> x >= 90).count(); // Arrays 부터 시작해서 끝낸다음에 컨트롤 알트 브이 하면 long count 붙여줌
        System.out.println(count);
        System.out.println("-------------------");

        // 90 점 이상인 사람들의 점수의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("-------------------");

        // 90 점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("-------------------");
    }
}
