public class NaturalNumber {
    //Write a function that returns the sum of first n natural numbers.
    public static void main(String[] args) {
        System.out.println(naturalNUmbers(56));
    }
    public static int naturalNUmbers(int nat){
        int num = nat*(nat+1)/2;
        return num;
    }
}
