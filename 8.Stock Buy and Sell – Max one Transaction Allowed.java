/*

Stock Buy and Sell – Max one Transaction Allowed
Difficulty: EasyAccuracy: 49.33%Submissions: 61K+Points: 2
Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.
Input: prices[] = [7, 6, 4, 3, 1]
Output: 0 
Explanation: Here the prices are in decreasing order, hence if we buy any day then we cannot sell it at a greater price. Hence, the answer is 0.
Input: prices[] = [1, 3, 6, 9, 11]
Output: 10 
Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1].
Constraint:
1 <= prices.size()<= 105
0 <= prices[i] <=104
*/

static int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;

        // Update the minimum value seen so far
          // if we see smaller
        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
           
            // Update result if we get more profit                
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

/* Explanation: One Traversal Solution - O(n) Time and O(1) Space
In order to maximize the profit, we need to minimize the cost price and maximize the selling price.
  So at every step, we keep track of the minimum buy price of stock encountered so far. 
  For every price, we subtract with the minimum so far and if we get more profit than the current result, we update the result.

*/
