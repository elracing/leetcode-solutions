// Last updated: 4/28/2026, 10:47:07 AM
class Solution {
    public int maxArea(int[] height) {
        if (height.length < 2) return 0;

        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int left = height[leftPointer];
        int right = height[rightPointer];
        int max = Math.min(left, right) * (rightPointer - leftPointer);

        while (leftPointer < rightPointer){

            if (left <= right) {
                leftPointer++;
                left = height[leftPointer];
                max = Math.max(max, Math.min(left, right) * (rightPointer - leftPointer));
            }

            else{
                rightPointer--;
                right = height[rightPointer];
                max = Math.max(max, Math.min(left, right) * (rightPointer - leftPointer));
            
            }

        }

        


        return max;

        

        
    }
}