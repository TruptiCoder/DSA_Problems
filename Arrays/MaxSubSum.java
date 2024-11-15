
public class MaxSubSum {

    public static int prefixSum(int arr[]) {
        int pre[] = new int[arr.length];
        int max = Integer.MIN_VALUE;

        // Step 1: prefix array
        pre[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            pre[i] = pre[i-1] + arr[i];
        }

        // Step 2: find maximum sum
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                int curr = i==0 ? pre[j] : pre[j] - pre[i-1];
                if(curr > max) {
                    max = curr;
                }
            }
        }

        return max;
    }


    // Using Kadan's Algorithm
    public static int maxSubarrySum(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs < 0) cs = 0;
            if(ms < cs) ms = cs;
        }

        // For all negative values
        if(ms == 0) {
            ms = arr[0];
            for(int i = 0; i < arr.length; i++) {
                if(ms < arr[i]) {
                    ms = arr[i];
                }
            }
        }

        return ms;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};

        System.err.println("Maximum subarray sum is " + maxSubarrySum(arr));
    }
}