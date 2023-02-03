package test;

class Calculator {
    public static int Left;
    public static int right;
    public static void sum() {
        System.out.println(Calculator.Left + Calculator.right); // 클래스란 서로 연관되어있는 변수와 메소드를 그룹해주는 역할
                                        // 다른 그룹과 구분해줌 (다른그룹이란 다른 클래스)
    }
}
class Employee {
    public static int period;
    public static int right;
    public static void sum(int period, int right){ // 위와같이 파라미터부분을 지워버리고 sout 부분에 Calculator.Left + Calculator.rigt를 넣어서
                                                    // 밑에 main부분에서 Left , right값을 정해주는 방식으로도 할수있고
                                                    // 파라미터를 만들어서 Employee.sum(2,5000) 등으로도 할수있다 , 같은방법
        System.out.println("급여 : " + right * period);
    }
}
public class Company {
    public static void main(String[] args) {
        Calculator.Left = 10;
        Calculator.right = 20;
        Calculator.sum();

        Employee.period = 2;
        Employee.right = 5000;
        Employee.sum(2,5000);
    }
}
