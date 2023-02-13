package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다."); // 알고보니 휴무인 경우
            throw new Exception("휴무 택시");
        } catch (Exception e){
            System.out.println("!! 문제 발생 : " + e.getMessage());
        } finally { // finally 는 말 그대로 캐치문 이후에 마지막으로 실행되어줌
                    // try throw 등으로 임시파일등을 만들어서 동작하다가 마무리로 삭제작업해주는것과같은 예제로도 사용할수있음
            System.out.println("택시의 문을 닫는다.");
        }
    }
}
