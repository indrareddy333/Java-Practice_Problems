package Practice_Daily;

public class _74_BasicCodes {
    public static void main(String[] args) {
        //hcf(36,60);
        //LCM(12,14);
        //BinaryToDecimal("1101");
        //PrimeFactors(90);
        //hcf(36, 60);
        RangePrime(100);
    }
    public static void hcf(int num1, int num2){
        int hcf = 0;
        for (int i = 1; i <= num2 || i<= num1; i++) {
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
    public static void LCM(int num1, int num2){
        int lcm = 0;
        int max = (num1<num2) ? num2:num1;
        for (int i = max; i <= num1*num2; i++) {
            if(i%num1==0 && i%num2==0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
    //0011;
    public static void BinaryToDecimal(String num){
        int decimal = 0;
        int n = 0;
        String Zeros = num.replaceAll("0", "");
        while(n < Zeros.length()){
            int Char = Zeros.charAt(n) - '0';
            decimal += Char * Math.pow(2,n);
            n++;
        }
        System.out.println(decimal);
    }
    static int isprime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    static void PrimeFactors(int num){
        for (int i = 2; i <= num ; i++) {
             if(isprime(i)==1){
                 int x = num;
                 while(x%i==0){
                     System.out.print(i+" ");
                     x/=i;
                 }
             }
        }
    }
    static void RangePrime(int range){
        for (int i = 1; i < range; i++) {
            boolean bool = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i%j==0){
                    bool = false;
                    break;
                }
            }
            if(bool){
                System.out.print(i + " ");
            }
        }
    }

}
