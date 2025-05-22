package Arrays;

public class BuySellStock {
	public static int buySellStock(int prices[]) {
		int buy = prices[0];
		int buyDay = 0;
		for(int i=1; i<prices.length; i++) {
			if(prices[i] < buy) {
				buy = prices[i];
				buyDay = i;
			}
		}
		System.out.println("Buying Price : " + buy);
		
		int sell=buy;
		int sellDay = buyDay+1;
		for(int i=buyDay+1; i<prices.length; i++) {
			if(prices[i] > sell) {
				sell = prices[i];
				sellDay = i;
			}
		}
		System.out.println("Selling Price : " + sell);
		
		int profit = sell - buy;
		if(profit>0) {
			return profit;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		//		int[] prices = {4,3,2,1};
		int profit = buySellStock(prices);
		System.out.println("Profit : " + profit);
	}

}
