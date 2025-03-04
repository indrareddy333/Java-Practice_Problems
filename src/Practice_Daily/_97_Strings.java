package Practice_Daily;

public class _97_Strings {
    public static void main(String[] args) {
        String num = "343";
        String num_2 = "hello";
        System.out.println(num + " " + num_2);

        int n = num.length();
        System.out.println(n);

        char[] chararray = num.toCharArray();
        int length = 0;
        for(char ch : chararray){
            length++;
        }
        System.out.println("length = "+ length);


        int[] array = {2,3,4,5,6,7};
        int length1 = 0;
        for(int arr : array){
            ++length1;
            System.out.println(length1);
        }
        System.out.println("Array_Length = "+length1);
    }
}
