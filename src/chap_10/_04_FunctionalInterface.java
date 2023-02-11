package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.ConvertibleWithNoParams;
import chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
//        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"),2);
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible,2);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

    }
    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}
