package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try{
//            System.out.println(3 / 0);
//            int[] arr = new int[3];
//            arr[5] = 100;
//            Object obj = "test";
//            System.out.println((int)obj);
            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ArithmeticException e) { // switch case 와 비슷한느낌으로 3/0을 이쪽부분에서 잡았으면 밑에 catch 는 작동하지 않고 캐치문 밖으로 빠져나옴
            System.out.println("뭔가 잘못 계산을 하셨네요.");
        } catch (ArrayIndexOutOfBoundsException e){ // 만약 여러가지 예외정보를 같은출력을 내고싶을때 catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {} 와 같은 형식으로 처리하면됨
            System.out.println("인덱스를 잘못 설정했어요.");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형 변환 입니다.");
        } catch (Exception e){ // 그냥 Exception 은 모든 Exception 의 조상 , 다른데에서 안걸러지면 여기로 오게됨 , 전화로 상담원 연결을 원하는것과 비슷한느낌
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요." + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 정상 종료");
    }
}
