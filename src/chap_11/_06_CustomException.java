package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        // 사용자 정의 예외
        int age = 17; // 만 17세
        try{
            if(age < 19) {
                //System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매하지 않습니다."); // 여기서 throw 해서 밑의 catch 부분에서 받음
                // 로그인하려고할때 지속적으로 계속 해도 DB에 그런계정은 없을 경우에 유효하지않거나 없는계정입니다라고 띄워주는것도 하나의 예제임
            } else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println("조금 더 성장한 뒤에 오세요.");
        } catch (Exception e) {
            System.out.println("모든 예외를 처리합니다.");
        }
    }
}
class AgeLessThan19Exception extends Exception {// 익셉션을 클래스로만들땐 익셉션 상속받아야함
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}