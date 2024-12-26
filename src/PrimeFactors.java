public class PrimeFactors {
    public static void main(String[] args) {
        int num = 450;

        while(num > 1){
            if(num % 2 == 0){
                num = num/2;
                System.out.println(2);
            }else{
                int i = 3;
                while(num>1){
                    if(num%i==0){
                        num = num/i;
                        System.out.println(i);
                    }else{
                        i+=2;
                    }
                }
            }
        }

    }
}
