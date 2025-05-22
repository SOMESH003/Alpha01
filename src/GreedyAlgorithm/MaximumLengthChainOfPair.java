package GreedyAlgorithm;
import java.util.*;
public class MaximumLengthChainOfPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pair = {{5,24},{39,60},{5,28},{27,40},{50,90}};
		
		Arrays.sort(pair,Comparator.comparingDouble(o -> o[1]));
		
		int chainCount = 1;
		int chainEnd = pair[0][1];
		
		for(int i=1; i < pair.length; i++) {
			if(pair[i][0] > chainEnd) {
				chainCount++;
				chainEnd = pair[i][1];
			}
		}
		
		System.out.println("maximum length of chain = " + chainCount);
	}

}
