package two_problems;
import java.util.ArrayList;
import java.util.Arrays;

public class FilterArray {
	public static void main(String args[]) {
		System.out.println(Arrays.toString(filterArray(new Object[] {1, 2, "a", "b"})));
		System.out.println(Arrays.toString(filterArray(new Object[] {1, "a", "b", 0, 15})));
		System.out.println(Arrays.toString(filterArray(new Object[] {1, 2, "aasf", "1", "123", 123})));
	}
	
	public static int[] filterArray(Object[] input) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(Object element: input) {
			if(element instanceof Integer) {
				answer.add((Integer) element);
			}
		}
		
		return answer.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
	}
}
