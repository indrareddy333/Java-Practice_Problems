public class PrimeinMethods {
    public static void main(String[] args) {
        CheckPrime(30);
    }
    static void CheckPrime(int a){
        int count = 0;
        int num = 1;
        while(num != a){
            if(a % num == 0){
                count++;
            }
            num++;
        }
        if(count == 1){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
    }

}

