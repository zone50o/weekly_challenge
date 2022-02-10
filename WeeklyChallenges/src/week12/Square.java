package week12;

import java.util.Arrays;

public class Square {
	public static void main(String[] args) {
		
	    squarePatch(3);
	    squarePatch(5);
	    squarePatch(1);
	    squarePatch(0);
	}
	
	public static int[][] squarePatch(int size) {
		int arr[][] = new int[size][size];
		if(size==0) {
			System.out.println("[]");
			return arr;
		}
		
		for(int[] a:arr) {
			Arrays.fill(a, size);
		}
		
		System.out.println("[");
		for(int i = 0; i < size; i++) {
			if(size==1){
				System.out.println(Arrays.toString(arr[i]));
			}
			else {
				System.out.println(Arrays.toString(arr[i])+",");
			}
		}
		System.out.println("]");
		
		return arr;
	}
}
