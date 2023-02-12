package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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

        // "python" , "java" , "javascript", "c" , "c++", "c#"
        // c로 시작하는 언어
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("-------------------");

        // java 라는 글자를 포함하는것
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("-------------------");

        // 글자 갯수가 4개 이하인것
        Arrays.stream(langs).filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("-------------------");

        // 4글자 이하이면서 c를 포함한것만출력
        Arrays.stream(langs).filter(x -> x.length() <= 4 && x.contains("c")).forEach(System.out::println);
        Arrays.stream(langs).filter(x -> x.length() <= 4).filter(x -> x.contains("c")).forEach(System.out::println);
        System.out.println("-------------------");

        // 4글자 이하이면서 c를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = Arrays.stream(langs).filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);
        System.out.println("-------------------");

        //4글자 이하이면서 c를 모두 포함하는지 여부
        boolean allMatch = Arrays.stream(langs).filter(x -> x.length() <= 4).allMatch(x -> x.contains("c"));
        System.out.println(allMatch);
        System.out.println("-------------------");

        // 4글자 이하이면서 c를 포함한 언어뒤에 (어려워요) 라는 문구 붙이기
        // map
        Arrays.stream(langs)
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("c"))
                .map(x -> x + "(어려워요)")
                .forEach(System.out::println);
        System.out.println("-------------------");

        // 위와같은조건에서 (어려워요) 를빼고 대문자로출력 
        // x -> x.toUpperCase() 로 해도됨
        Arrays.stream(langs).filter(x -> x.length() <= 4).filter(x -> x.contains("c")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("-------------------");

        // c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트에 저장
        // 참고로 Arrays.stream(langs) 로 시작하나 langs.stream() 으로 시작하나똑같다
        List<String> langListStartWithC = Arrays.stream(langs).filter(x -> x.contains("c")).map(String::toUpperCase).collect(Collectors.toList());
        langListStartWithC.stream().forEach(System.out::println);
    }
}
