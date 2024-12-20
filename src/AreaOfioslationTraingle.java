public class AreaOfioslationTraingle {
    public static void main(String[] args) {
        int a = 13;
        int b = 24;
        int  tri = (a*a) - (b*b)/4;
        double area = Math.sqrt(tri);
        double triangle = (area*b)/2;
        System.out.println(triangle);
    }
}
