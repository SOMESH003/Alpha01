package DivideAndConquer;

public class SortStringArray_MergeSort {
	public static String[] mergeSort(String str[], int si, int ei) {
		if(si == ei) {
			String[] a = {str[si]};
			return a;
		}
		
		int mid = si + (ei-si)/2;
		String[] str1 = mergeSort(str,si,mid);
		String[] str2 = mergeSort(str,mid+1,ei);
		
		String[] str3 = merge(str1,str2);
		return str3;
	}
	
	public static String[] merge(String[] str1, String[] str2) {
		int n = str1.length; // i
		int m = str2.length; // j
		
		String[] res = new String[n+m];
		
		int i=0;
		int j=0; 
		int idx = 0;
		
		while(i<n && j<m) {
			if(isSmaller(str1[i], str2[j])) {
				res[idx] = str1[i];
				idx++;
				i++;
			}
			else {
				res[idx] = str2[j];
				j++;
				idx++;
			}
		}
		
		while(i<n) {
			res[idx] = str1[i];
			i++;
			idx++;
		}
		while(j<n) {
			res[idx] = str2[j];
			j++;
			idx++;
		}
		return res;
	}
	
	public static boolean isSmaller(String str1, String str2) {
		if(str1.compareTo(str2) < 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"sun","earth","mars","mercury"};
		String[] str = mergeSort(arr,0,arr.length-1);
		for(int i=0; i<str.length;i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}

}
