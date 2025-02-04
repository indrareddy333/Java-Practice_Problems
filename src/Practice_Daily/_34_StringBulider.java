package Practice_Daily;

public class _34_StringBulider {
    public static void main(String[] args) {
        StringBuffer series = new StringBuffer();
        for (int i = 0; i<26;i++){
            char ch = (char)('a'+i);
            series.append(ch);
        }
        System.out.println(series);
        System.out.println(series.indexOf("x"));


    }
}
