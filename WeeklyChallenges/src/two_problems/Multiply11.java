package two_problems;

public class Multiply11 {
	public static void main(String[] args) {
		System.out.println(multiplyBy11("11"));
		System.out.println(multiplyBy11("111111111"));
		System.out.println(multiplyBy11("1213200020"));
		System.out.println(multiplyBy11("1217197941"));
		System.out.println(multiplyBy11("9473745364784876253253263723"));

	}
	
	private static String multiplyBy11(String input) {
		char[] cArray = input.toCharArray();
		
		StringBuilder answer = new StringBuilder ("");
		answer.insert(0, cArray[cArray.length-1]);
		int start = Character.getNumericValue(cArray[0]);
		boolean isPlusOne=false;
		
		for (int i = cArray.length-1; i>0; i--){
			int temp = Character.getNumericValue(cArray[i])
					+Character.getNumericValue(cArray[i-1]);
			
			if (isPlusOne) {
				temp+=1;
				isPlusOne=false;
			}
			
			if (temp>9) {
				temp-=10;
				isPlusOne=true;
			}
	
			answer.insert(0, temp);
			
		}
		
		if(isPlusOne)
			answer.insert(0, start+1);
		else {
			answer.insert(0, start);
		}
			
		return answer.toString();
	}


}
