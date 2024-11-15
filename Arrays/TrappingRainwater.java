

public class TrappingRainwater {

    public static int TrappedWater(int height[]) {
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int max = 0, waterTrapped = 0;

        // Left maximum boundry array
        for (int i = 0; i < height.length; i++) {
            if(max < height[i]) {
                max = height[i];
            }
            leftMax[i] = max;
        }

        // Right maximum boundry array
        for (int i = height.length-1; i >= 0; i--) {
            if(max < height[i]) {
                max = height[i];
            }
            rightMax[i] = max;
        }

        // Trapped water - main loop
        for(int i = 0; i < height.length; i++) {
            // water level
            int wl = Math.min(leftMax[i], rightMax[i]);
            // trapped water
            waterTrapped = waterTrapped + (wl - height[i]);
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 2, 5};

        System.out.println("Total water trapped: " + TrappedWater(height));
    }
}