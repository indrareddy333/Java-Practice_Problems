public class DiffereProductAdd {
    //https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/1480692903/
    public static int subtractProductAndSum(int n) {
            int mutli = 1;
            int add = 0;
            while(n>0){
                int re = n % 10;
                mutli *= re;
                add += re;
                n/=10;
            }
            return mutli-add;
    }

    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
   }
}
