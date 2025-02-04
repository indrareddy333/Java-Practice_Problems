package Practice_Daily;

public class _33_StringsInSeries {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i<26;i++){
            char ch = (char)('a'+i);
            series = series + ch;
            System.out.println(series);
            System.out.println("object address : "+System.identityHashCode(series));
        }
        System.out.println(series);
        System.out.println("object address : "+System.identityHashCode(series));
    }
}
