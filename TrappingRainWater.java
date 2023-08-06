public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        int maxBefore[] = new int[n];
        int maxAfter[] = new int[n];
        maxBefore[0] = height[0];
        maxAfter[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            maxBefore[i] = Math.max(height[i], maxBefore[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            maxAfter[i] = Math.max(height[i], maxAfter[i + 1]);
        }

        int waterLevel = 0;
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            waterLevel = Math.min(maxAfter[i], maxBefore[i]) - height[i];
            trappedWater += waterLevel > 0 ? waterLevel : 0;
        }
        return trappedWater;
    }

}
