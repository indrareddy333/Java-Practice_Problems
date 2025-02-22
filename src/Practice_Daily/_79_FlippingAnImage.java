package Practice_Daily;



public class _79_FlippingAnImage {
    //Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    //Output: [[1,0,0],[0,1,0],[1,1,1]]
    //Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    // and Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] store = flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                System.out.print(store[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] storeArray = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            for (int j = image.length-1; j >= 0; j--) {
                int number = image[i][j];
                storeArray[i][(image.length-1)-j] = 1^number;
            }
        }
        return storeArray;
    }
}

