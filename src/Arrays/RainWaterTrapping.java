package Arrays;

import java.util.Arrays;

public class RainWaterTrapping {
	public static int rainWaterTrapping(int height[]) {
		int n = height.length;
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];
		
		leftMax[0] = height[0];
		for(int i=1; i<n; i++) {
			if(leftMax[i-1] > height[i]) {
				leftMax[i] = leftMax[i-1];
			}
			else {
				leftMax[i] = height[i];
			}
		}
		
		rightMax[n-1] = height[n-1];
		for(int i=n-2; i>=0;i--) {
			if(rightMax[i+1] > height[i]) {
				rightMax[i] = rightMax[i+1];
			}
			else {
				rightMax[i] = height[i];
			}
		}
		
		int totalWaterTrapped = 0;
		int waterlevel;
		for(int i=0; i<n; i++) {
			if(rightMax[i] > leftMax[i]) {
				waterlevel = leftMax[i];
			}
			else {
				waterlevel = rightMax[i];
			}
			totalWaterTrapped = totalWaterTrapped + (waterlevel-height[i]);
		}
		
		
		return totalWaterTrapped;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {4,2,0,6,3,2,5};
		System.out.println("Total water Trapped : " + rainWaterTrapping(heights));
	}

}
