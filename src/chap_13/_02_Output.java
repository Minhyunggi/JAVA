package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        //System.out.printf();
        //System.out.format();

        System.out.println("------------정수-------------");
        System.out.printf("%d%n",1);
        System.out.printf("%d %d %d %n" , 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n" , 1234); // 6자리의 공간을 확보하고 나서 1234 출력
        System.out.printf("%06d%n", 1234); // 6자리의 공간을 확보하고 나서 1234 출력을 하지만 빈공간은 0으로 채움
        System.out.printf("%6d%n" , -1234); // -도 한 자리를 차지함 _-1234
        System.out.printf("%+6d%n" , 1234); // _+1234
        System.out.printf("%,15d%n", 1000000000); // __1,000,000,000 (세자리마다 콤마로 구분)
        System.out.printf("%-6d%n", 1234); // 6자리 공간을 확보하고 나서 왼쪽부터 1234출력

        System.out.println("------------실수-------------");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI); // 3.14 소숫점 둘째자리까지 출력
        System.out.printf("%6.2f%n", Math.PI); // 6자리 공간확보후 소숫점 둘째자리까지 출력
        System.out.printf("%-6.2f%n", Math.PI);
        System.out.printf("%06.2f%n", Math.PI); // 003.14

        System.out.println("------------문자열-------------");
        System.out.printf("%s%n", "Java"); // JAVA
        System.out.printf("%6s%n", "Java"); // __JAVA
        System.out.printf("%-6s%n", "Java"); // Java__
        System.out.printf("%6.2s%n", "Java"); // ____Ja ( 6자리 공간 확보후 우측 정렬해서 2글자 출력)
        System.out.printf("%-6.2s%n", "Java"); // Ja____ ( 6자리 공간 확보후 좌측 정렬해서 2글자 출력)

        System.out.println("------------응용전-------------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0); // 강백호 90 80 85.0
        System.out.println("서태용 " + 100 + " " + 100 + " " + 100.0); //
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5); //

        System.out.println("------------응용후-------------");
        System.out.println("이름      영어   수학   평균"); // 공백이 각각 6 3 3
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호" , 90,80,85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태용" , 100,100,100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수" , 95,100,97.5);
    }
}
