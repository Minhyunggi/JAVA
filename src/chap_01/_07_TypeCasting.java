package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        float score_f = 93.3F;
        double score_b = 98.8;

        score = score + (int) score_b;
        System.out.println(score);

        score_b = score + score_b;
        System.out.println(score_b);

        int convertedScoreInt = (int)score_b;
        System.out.println(convertedScoreInt);

        //숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.9);
        s2 = Double.toString(98.9);
        System.out.println(s2);

        //문자를 숫자열로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);
    }
}
