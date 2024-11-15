public class LargestEle {
    public static void main(String args[]) {
        int arr[] = {3, 54, 23, 65, 21, 77, 25};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("largest in array is " + max);
    }
}