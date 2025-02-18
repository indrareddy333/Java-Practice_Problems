package Practice_Daily;

public class _71_BitwiseOperaters {
    public static void main(String[] args) {
        int n = 8;
        if((n & 1) == 1){
           // System.out.println("odd");
        }
        else{
            //System.out.println("even");
        }
        int [] array = {2,3,2,3,4,5,4};
        int unique = 0;
        for(int num : array){
            unique ^= num;
        }
        //System.out.println(unique);
        //System.out.println(10<<5);
        System.out.println(4>>1);;
    }
}
