class Solution {
    public int coinChange(int[] coins, int amount) {
        int max =amount+1;
        int[] dp=new int [amount+1];
        Array.fill(dp,max);
        dp[0]=0;
        for(i=1;i<=amount;i++)
            for(j=0;j<coins.length;j++){
                {
                    if(coins[j]<=i){
                        dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                        
                    }
                }
            }
    return dp[amount]>amount?-1:dp[amount];
        
    }
    
}