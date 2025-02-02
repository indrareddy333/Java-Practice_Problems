package Practice_Daily;

public class _28_StringPractice {
    public static void main(String[] args) {
        /*
        String[] str = {"hello","world"};
        System.out.println("hash:1 = "+str[0].hashCode()+": "+str[1].hashCode());
        String[] str1 = {"hello","world"};
        System.out.println("hash:2 = "+str1[0].hashCode()+": "+str1[1].hashCode());
        System.out.println(str[1]==str1[1]);
        */

        String value = new String("Hello");
        System.out.println(value.hashCode());
        String Value1 = new String("Hello");
        System.out.println(Value1.toString());
        System.out.println(value==Value1);
        System.out.println(value.equals(Value1));
    }
}
