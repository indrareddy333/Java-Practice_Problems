public class EvenNumbersofDigits {
    public static void main(String[] args) {
        int[] nums = {-12,-234};
        evenDigits(nums);
    }
    public static void evenDigits(int [] nums){
        for(int i = 0; i<nums.length;i++){
            int dig = nums[i];
            int count = 0;
            if(dig < 0){
                dig = dig*-1;
            }
            while(dig>0){
                count++;
                dig/=10;
            }
            if(count%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
