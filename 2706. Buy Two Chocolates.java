class Solution {
    public int buyChoco(int[] prices, int money) {
       Arrays.sort(prices);
        int a=prices[0]+prices[1];
        if(money-a>=0){
            return (money-a);
        }
        return money;
    }
}
