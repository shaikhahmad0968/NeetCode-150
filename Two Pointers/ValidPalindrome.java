import java.util.Scanner;

public class ValidPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(s));
        sc.close();
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(left< right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left< right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
