package GreedyAlgorithm;
import java.util.*;

public class Indian_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] coins = {1,2,5,10,20,50,100,500,2000};
		
		Arrays.sort(coins,Comparator.reverseOrder());
		
		int coinCount = 0;
		int amount = 3963;
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i=0; i < coins.length; i++) {
			if(coins[i] <= amount) {
				while(coins[i] <= amount) {
					coinCount++;
					amount -= coins[i];
					ans.add(coins[i]);
				}
			}
		}
		
		System.out.println("Total minimum coins used : " + coinCount);
		
		for(int i=0; i< ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
		

	}

}
