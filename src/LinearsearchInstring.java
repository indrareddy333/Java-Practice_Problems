public class LinearsearchInstring {
    public static void main(String[] args) {
        String str = "indra";
        char target = 'n';
        int chin = linearStr(str, target);
        System.out.println(chin);
    }
    public static int linearStr(String str, char target){
        for (int i = 0; i<str.length();i++){
            if(target == str.trim().charAt(i)){
                return i;
            }
        }
        return -1;
    }

}

