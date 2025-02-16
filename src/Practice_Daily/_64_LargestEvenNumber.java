package Practice_Daily;

public class _64_LargestEvenNumber {
    //Input
    //35427
    //Output
    //3542
    public static void main(String[] args) {
        String In = "4806";
        String out = "";
        int maxodd = -1;
        for (int i = 0; i < In.length(); i++) {
            char ch = In.charAt(i);
            int num = ch - '0';
            if(num%2!=0){
                if(maxodd<num){
                    maxodd = num;
                }
            }
        }
        for (int j = 0; j < In.length(); j++) {
            char ch = In.charAt(j);
            int num = ch - '0';
            if(num != maxodd){
                out = out + Integer.toString(num);
            }
            else{
                out = out + " ";
            }
        }
        System.out.println(out);
    }

}
