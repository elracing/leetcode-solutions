// Last updated: 4/28/2026, 10:45:57 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        
        for (int i = 0; i < piles.length; i++){
            right = Math.max(piles[i], right);
        }

        int idealSpeed = right;

  

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long timeTaken = 0;

            for (int i = 0; i < piles.length; i++){
               timeTaken += ((piles[i] + mid - 1) / mid);

            }

            if (timeTaken > h) {
                left = mid + 1;
               
            }

            else {
                
                idealSpeed = mid;
                right = mid - 1;

                
            }

            timeTaken = 0;


        }

        return idealSpeed;


        
    }
}