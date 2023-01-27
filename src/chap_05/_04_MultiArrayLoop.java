package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][] {
                {"A1" , "A2" , "A3" , "A4" , "A5"},
                {"B1" , "B2" , "B3" , "B4" , "B5"},
                {"C1" , "C2" , "C3" , "C4" , "C5"}
        };

        for (int i = 0; i < 3; i++) { // 세로
            for (int j = 0; j < 5; j++) { // 가로
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        // 배열이 일정하지 못할때
        String[][] seats2 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) { // seats2[1].length = {"B1","B2","B3","B4"} 이므로 seats2[i]를 넣어주면 해결
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
