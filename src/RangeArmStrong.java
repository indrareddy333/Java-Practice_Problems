public class RangeArmStrong {
    public static void main(String[] args) {
        Rangearmstrong();
    }
    static void Rangearmstrong(){
        for(int i = 100; i<1000;i++){
           if (Armstong(i) == i){
               System.out.println(i);
           }
        }
    }

    static int Armstong(int a){
        int result = 0;
        while(a>0){
            int rem = a%10;
            result += rem*rem*rem;
            a = a/10;
        }
        return result;


    }

}
