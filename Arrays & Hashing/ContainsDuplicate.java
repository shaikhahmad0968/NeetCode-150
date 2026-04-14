import java.util.*;
public class ContainsDuplicate{
    public static void main(String[] args){
        int[] nums = {1,2,4,4,3};
        boolean bool = Solution.hasDuplicate(nums);
        System.out.println(bool);
    }
}
class Solution {
    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)){
                return true;
            }
        }
        return false;
    }
}