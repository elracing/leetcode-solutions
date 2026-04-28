// Last updated: 4/28/2026, 10:46:13 AM
import java.util.*;

class Solution {
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] topKFrequent(int[] nums, int k) {
        for ( int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(map.entrySet());
        sorted.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = sorted.get(i).getKey();
        }

        return arr;


    }
}