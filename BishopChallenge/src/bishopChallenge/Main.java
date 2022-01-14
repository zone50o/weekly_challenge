package bishopChallenge;

public class Main {

	public static void main(String[] args) {
		System.out.println(bishop("a1", "b4", 2));
		System.out.println(bishop("a1", "b5", 5));
		System.out.println(bishop("f1", "g2", 1));
		System.out.println(bishop("f1", "f1", 0));
		System.out.println(bishop("f1", "g2", 0));
		System.out.println(bishop("a1", "b4", 1));
	
	}

	public static boolean bishop(String start, String end, int moves) {
		
		if(start.equals(end)) {
			return true;
		}else if(moves==0) {
			return false;
		}
		
		int startX = getXCoord(start);
		int startY = getYCoord(start);
		
		int endX = getXCoord(end);
		int endY = getYCoord(end);
		
		if(isDifferentColorSpace(startX, startY, endX, endY)) {
			return false;
		}
		
		if(moves>=2) {
			return true;
		}

		if(isOnSameDiagonal(startX, startY, endX, endY)) {
			return true;
		}
		
		return false;
	}

	public static int getXCoord(String point) {
		return point.charAt(0)-96;
	}

	public static int getYCoord(String point) {
		return Integer.parseInt(point.substring(1));
	}
	
	public static boolean isDifferentColorSpace(int startX, int startY, int endX, int endY) {
		return ((Math.abs(startX-endX)+Math.abs(startY-endY))%2!=0);
	}
	
	public static boolean isOnSameDiagonal(int startX, int startY, int endX, int endY) {
		return ((startX-endX)==(startY-endY));
	}
}
