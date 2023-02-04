package ClassReview;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이"; // 까망이(최신형)
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        b2.appendModelName("(구형)");
        System.out.println(b2.modelName);
    }
}
