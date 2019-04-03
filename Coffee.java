public class Coffee {
    static String origin="Colombia";
    static String roast="light";
    static int grade=1;
    public Coffee(String origin) {
        this.origin=origin;
    }
    public Coffee(int grade) {
        this.grade=grade;
    }
    static void roast() {
        System.out.println("roasting is completed");
        System.out.println("origin : " + origin);
        System.out.println("grade : " + grade);
    }
    static void grind() {
        System.out.println("grinding is completed");
        System.out.println("origin : " + origin);
        System.out.println("grade : " + grade);
    }
    static void brew() {
        System.out.println("brewing is completed");
        System.out.println("origin : " + origin);
        System.out.println("grade : " + grade);
    }
    public static void main(String[] args) {
        roast();
        grind();
        brew();
    }
}
