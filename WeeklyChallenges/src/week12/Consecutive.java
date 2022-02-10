package week12;

public class Consecutive {
	public static void main(String[] args) {
		System.out.println(ascending("232425"));
		System.out.println(ascending("2324256"));
		System.out.println(ascending("444445"));
		
	}
	
	public static boolean ascending(String input) {
		
		for(int size = 1; size <= input.length()/2; size++) {
			int temp = Integer.parseInt(input.substring(0, size));
			boolean isIncrement = true;
			if(input.length()%size!=0) {
				continue;
			}
			for(int i = size; i<=input.length()-size; i+=size) {	
				if(temp>=Integer.parseInt(input.substring(i, i + size))) {
					isIncrement = false;
					break;
				}else {		
					temp = Integer.parseInt(input.substring(i, i + size));
				}
			}
			if(isIncrement) {
				return true;
			}
		}
		
		return false;
	}
}
