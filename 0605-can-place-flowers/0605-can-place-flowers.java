class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current position is valid for planting a flower
            // Special case for the first element
            if (i == 0 && flowerbed[i] != 1 && (flowerbed.length == 1 || flowerbed[i + 1] != 1)) {
                flowerbed[i] = 1;
                count++;
            }
            // Special case for the last element
            else if (i == flowerbed.length - 1 && flowerbed[i] != 1 && flowerbed[i - 1] != 1) {
                flowerbed[i] = 1;
                count++;
            }
            // General case for the middle elements
            else if (i != 0 && i != flowerbed.length - 1 && flowerbed[i] != 1 && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                flowerbed[i] = 1;
                count++;
            }

            // If we've already placed enough flowers, return early
            if (count >= n) {
                return true;
            }
        }
        
        // After the loop, check if we were able to place enough flowers
        return count >= n;
    }
}
