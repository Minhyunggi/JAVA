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

    }
}
