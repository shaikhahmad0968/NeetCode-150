
import java.util.Arrays;
import java.util.HashMap;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        //Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        //store result
        int[] arr = new int[k];
        int j = 0;

        //Finding top k frequent elements
        while (k > 0) {
            int maxFreq = -1;
            int maxElement = -1;

            for (int n : map.keySet()) {
                if (map.get(n) > maxFreq) {
                    maxFreq = map.get(n);
                    maxElement = n;
                }
            }

            arr[j++] = maxElement;
            map.remove(maxElement);
            k--;
        }

        return arr;
    }
    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.println("Top K Frequent Elements: " + Arrays.toString(result));
    }
}