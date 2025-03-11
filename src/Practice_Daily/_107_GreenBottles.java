package Practice_Daily;
public class _107_GreenBottles {
    public static void main(String[] args) {
        // if ten bottles
        int BottleNum = 10;
        String word = "bottles";
        while(BottleNum>0){
            if(BottleNum == 1){
                word = "bottle";
            }
            System.out.println(BottleNum + " green " + word + " ,Hanging on wall");
            System.out.println("And if one green bottle should accidentally fall, ");
            BottleNum -= 1;

            if(BottleNum > 0){
                System.out.println("There'll be " + BottleNum + " green " + word + " hanging pn wall ");
            }
            else{
                System.out.println(
                    "There'll be no green bottles, hanging on the wall"
                );
            }
        }
    }
}
