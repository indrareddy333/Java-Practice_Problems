package Practice_Daily;

public class _32_FindingFirstLetterArrays {
    public static void main(String[] args) {
        String[] name = {"indra", "sena", "Reddy", "indra1", "Reddy2"};
        for(int i = 0;i< name.length;i++){
            if(name[i].charAt(0)=='i'){
                System.out.println(name[i]);
            }
        }
    }
}
