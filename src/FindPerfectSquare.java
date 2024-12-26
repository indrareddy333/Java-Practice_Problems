public class FindPerfectSquare {
    public static void main(String[] args) {
        int num = 82;
        int isSquare = (int)Math.sqrt(num);
        if(num == (isSquare*isSquare)){
            System.out.println("perfect square");
        }
        else{
            System.out.println("Not a perfect square");
        }
    }
}
