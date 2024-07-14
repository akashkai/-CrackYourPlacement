class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0;
        int minprofit=prices[0];

        for(int i=1;i<n;i++){
            int cost=prices[i]-minprofit;
            maxprofit=Math.max(maxprofit,cost);
            minprofit=Math.min(minprofit, prices[i]);
        }
        return maxprofit;
    }
}