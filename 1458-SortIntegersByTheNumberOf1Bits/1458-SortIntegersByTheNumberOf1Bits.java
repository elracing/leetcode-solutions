// Last updated: 4/28/2026, 10:45:53 AM
class Solution {
    public int[] sortByBits(int[] arr) {

        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (a, b) -> {
            Integer bitA = Integer.bitCount(a);
            Integer bitB = Integer.bitCount(b);

            if (bitA == bitB) return a - b;

            return bitA - bitB;
        });

        for (int i = 0; i < arr.length; i++){
            arr[i] = boxed[i];
        }

        return arr;
        
    }
}