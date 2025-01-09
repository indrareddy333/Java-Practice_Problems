public class BinarySearchChars {
    public static void main(String[] args) {
        char[] nums = {'c','f','g'};
        char target = 'c';
        System.out.println((char)binaryChar(nums,target));
    }
    public static int binaryChar(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if((int)letters[mid]<(int)target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return letters[start%(letters.length)];
    }
}
