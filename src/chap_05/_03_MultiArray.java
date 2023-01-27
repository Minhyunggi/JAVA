package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5

        //1차원배열로 한다고치면
        String[] seatA = {"A1" , "A2" , "A3" , "A4" , "A5"};
        String[] seatB = {"B1" , "B2" , "B3" , "B4" , "B5"};
        String[] seatC = {"C1" , "C2" , "C3" , "C4" , "C5"};

        // 2차원 배열 선언 3 x 5 크기
        String[][] seats = new String[][] {
                {"A1" , "A2" , "A3" , "A4" , "A5"},
                {"B1" , "B2" , "B3" , "B4" , "B5"},
                {"C1" , "C2" , "C3" , "C4" , "C5"}
        };

        // B2에 접근하려면?
        System.out.println(seats[1][1]);
        // C5에 접근하려면?
        System.out.println(seats[2][4]);
    }
}
