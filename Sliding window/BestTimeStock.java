public class BestTimeStock {
    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        int res = Solution.maxProfit(prices);
        System.out.println(res);
    }
}
class Solution {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProf=0;
        for(int price : prices){
            if(price<minPrice){
                minPrice = price;
            } else{
                int profit = price - minPrice;
                if(profit > maxProf){
                    maxProf = profit;
                }
            }
        }
        
        return maxProf;
    }
}
