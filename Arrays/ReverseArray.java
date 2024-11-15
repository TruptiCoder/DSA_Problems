public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int left = 0, right = arr.length-1;

        while(left < right) {
            arr[left] = arr[left] + arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   
        }
    }
}