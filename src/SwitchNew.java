public class SwitchNew {
    public static void main(String[] args) {
        String season = "rainy";
        switch(season){
            case "winter" -> System.out.println("The climate is very cold");
            case "rainy" -> System.out.println("The climate is very cold and rainy all the day");
            case "summer" -> System.out.println("The climate is very hot");
            case "monsoon" -> System.out.println("the climate was cool breeze");
            default -> System.err.println("error:invalid expression");
        }
    }
}
