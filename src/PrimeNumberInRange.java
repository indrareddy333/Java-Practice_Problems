public class PrimeNumberInRange {
    public static void main(String[] args) {
        int num = 45;
        int count = 0;
        int i = 2;
        while (i<=num){
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+ " ");
            }
            i++;
            count = 0;
        }
    }
}
