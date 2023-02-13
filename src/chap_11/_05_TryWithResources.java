package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("아이스크림이 먹고싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("-------------------------");
        try(MyFileWriter writer2 = new MyFileWriter()) { // try 부분에 괄호로 객체를 만들어주고 클래스에서 AutoCloseable 인터페이스를 사용했다면 별도의 close 메소드 없이도 쓴것처럼 적용된다.
            writer2.write("빵이 먹고싶어요");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }
    public void write(String line) {
        System.out.println("파일의 내용을 입력합니다.");
        System.out.println("입력 내용 : " + line);
    }

}