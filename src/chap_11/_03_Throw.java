package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17; // 만 17세
        try{
            if(age < 19) {
                //System.out.println("만 19세 미만에게는 판매하지 않습니다.");
                throw new Exception("만 19세 미만에게는 판매하지 않습니다."); // 여기서 throw 해서 밑의 catch 부분에서 받음
                                                                            // 로그인하려고할때 지속적으로 계속 해도 DB에 그런계정은 없을 경우에 유효하지않거나 없는계정입니다라고 띄워주는것도 하나의 예제임
            } else {
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
