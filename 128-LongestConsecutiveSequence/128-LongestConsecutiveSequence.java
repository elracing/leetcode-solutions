// Last updated: 4/28/2026, 10:46:38 AM
import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int streakCount = 0;
        if (nums.length > 0){
            streakCount = 1;
        }


        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        for (int item: set) {
            int i = 1;
            if (!set.contains(item - 1)){
                while(true){
                    if(set.contains(item + i)){
                        i++;
                    }
                    
                    else{
                        break;
                    }

                    if (i > streakCount) {
                        streakCount = i;
                    }
                
                }
            }
        }

        return streakCount;

    }
}