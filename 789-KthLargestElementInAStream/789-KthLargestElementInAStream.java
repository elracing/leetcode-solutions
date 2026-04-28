// Last updated: 4/28/2026, 10:46:02 AM
class KthLargest {

    private PriorityQueue<Integer> heap;
    private int k;


    public KthLargest(int k, int[] nums) {
        this.heap = new PriorityQueue<>();
        this.k = k;

        for (int i = 0; i < nums.length ; i++) {
            heap.add(nums[i]);

            if(heap.size() > k) {
                heap.poll();
            }
        }
        
    }
    
    public int add(int val) {

        heap.add(val);
        if(heap.size() > k){
            heap.poll();
        }

        return heap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */