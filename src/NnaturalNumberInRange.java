public class NnaturalNumberInRange {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int RangeNatural = NaturalNumber(num2) - NaturalNumber(num1-1);
        System.out.println(RangeNatural);
    }
    public static int NaturalNumber(int num){
        int result = (num*(num+1))/2;
        return result;
    }

}
