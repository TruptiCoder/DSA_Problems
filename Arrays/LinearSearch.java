public class LinearSearch {
    public static void main(String args[]) {
        int arr[] = {1 , 4, 6, 34, 23, 66, 42};
        int key = 23, flag = 0;
        for(int i = 0; i < arr.length; i++) {
            if(key == arr[i]) {
                System.out.println("Key found at index: " + i);
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            System.out.println("Key not found!");
        }
    }
}