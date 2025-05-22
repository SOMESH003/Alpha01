package GreedyAlgorithm;
import java.util.*;

public class Chocola_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, m = 6;
		Integer[] costVer = {2,1,3,1,4};
		Integer[] costHor = {4,1,2};
		
		Arrays.sort(costVer,Collections.reverseOrder());
		Arrays.sort(costHor,Collections.reverseOrder());
		
		int h = 0, v = 0;
		int vp = 1, hp = 1;
		int cost = 0;
		
		while(h < costHor.length && v < costVer.length) {
			if(costHor[h] >= costVer[v]) {
				cost += (vp * costHor[h]);
				hp++;
				h++;
			}
			else {
				cost += (hp * costVer[v]);
				vp++;
				v++;
			}
		}
		
		while(h < costHor.length) {
			cost += (vp * costHor[h]);
			hp++;
			h++;
		}
		while(v < costVer.length) {
			cost += (hp * costVer[v]);
			vp++;
			v++;
		}
		
		System.out.println("Minimum cost of breaking whole chocolate : " + cost);
	}

}
