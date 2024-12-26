public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 76;
        int product = num*num;
        int result = 0;
        int Result = Reverse(num,product,result);
        int result1 = Reverse(num,Result,result);
        System.out.println(num == result1 ? "Automorphic number" : "Not a automorphic number");
    }
    public static int Digitcount(int pro){
        int count = 0;
        while(pro > 0){
            pro/=10;
            count++;
        }
        return count;
    }
    public static int Reverse(int num, int product, int result){
        int reverse = 0;
        for(int i = 0; i < Digitcount(num); i++){
            result = product % 10;
            reverse = reverse * 10 + result;
            product/=10;
        }
        return reverse;
    }

}
