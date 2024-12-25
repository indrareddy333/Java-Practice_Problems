public class BinarySearch {
    public static void main(String[] args) {
        int[] Array = {1,24,44,99,120};
        int result = binarysearch(24, Array);
        System.out.println(result);

    }
    public static int binarysearch(int target, int[] array){
        int start = 0;
        int end = array.length -1;
        while(start < end){
            int mid = start+end/2;
            if(array[mid] == target){
                return mid;
            }
            else if (array[mid] < target) {
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

}
