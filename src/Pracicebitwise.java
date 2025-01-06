public class Pracicebitwise {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int result = (~a & b) | (a & ~b);
        System.out.println(result);
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(a & b);
        System.out.println(a | b);
    }
}
