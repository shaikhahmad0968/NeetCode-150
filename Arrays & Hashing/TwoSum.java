import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                arr[0] = map.get(diff);
                arr[1] = i;
                return arr;
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i<size; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target number: ");
        int target = sc.nextInt();
        int[] res = new int[2];
        TwoSum obj = new TwoSum();
        res = obj.twoSum(nums, target);
        for(int i =0; i<2; i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
}
