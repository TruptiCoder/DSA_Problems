public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 4, 22, 43, 65, 70, 78};
        int key = 4, flag = 0;
        int high = arr.length-1;
        int low = 0;

        while(low <= high) {
            int mid = (low + high)/2;

            if(arr[mid] == key) {
                System.out.println("Key found at index: " + mid);
                flag = 1;
                break;
            }
            else if(arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if(flag == 0) {
            System.out.println("Key not found!");
        }
    }
}