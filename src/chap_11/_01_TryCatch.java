package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일오류(코드에문제가있어서 프로그램이 실행조차 되지않음)
        // int i = "아이"; < 컴파일오류
        // 오류 : 런타임오류(컴파일은 되지만 실행하는과정에서 생기는오류) , 두가지종류 (error 에러 , exception 예외)
        // int[] arr = new int[3]
        // arr[5] = 3; < 런타임 오류

        try{
//            System.out.println(3 / 0);
//            int[] arr = new int[3];
//            arr[5] = 100;
            Object obj = "test";
            System.out.println((int)obj);
        } catch (Exception e){
            System.out.println("이런 문제가 발생했어요" + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
