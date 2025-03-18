package Practice_Daily;

public class _117_StringsJava {
    public static void main(String[] args) {
        String str = "Hello the main thing is that";
        String hlo = str.substring(0,5);
        System.out.println(hlo);

        String name = str + " " + hlo;
        System.out.println(name);
     }
}
