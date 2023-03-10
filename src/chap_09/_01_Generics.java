package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
        String[] sArray = {"A","B","C","D","E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("----------------");
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }
    // <T> 는 타입을 의미함
    // 제네릭스는 여러가지 같은 메소드를 하나로 줄여줄수있음
    // String Double Integer 등 대문자로시작하는것으로 사용해야한다.
    private static <T> void printAnyArray(T[] array) {
        for (T t :
                array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s :
             sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d :
                dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i :
                iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
        System.out.println();
    }

}
