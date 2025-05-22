package GreedyAlgorithm;

public class BuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		
		int buy = prices[0], maxProfit = 0;
		
		for(int i=1; i<prices.length; i++) {
			if(prices[i] < buy) {
				buy = prices[i];
			}
			
			else if(prices[i] - buy > maxProfit) {
				maxProfit = prices[i] - buy;
			}
		}
		System.out.println("Maximum Profit : " + maxProfit);
	}

}
