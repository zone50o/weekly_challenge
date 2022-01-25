package pin_validate;

public class Main {
	public static void main(String[] args) {
		System.out.println(validate("121317"));

		System.out.println(validate("1234"));

		System.out.println(validate("45135"));

		System.out.println(validate("89abc1"));

		System.out.println(validate("900876"));

		System.out.println(validate(" 4983"));
	}
	
	public static boolean validate(String input) {
		if(input == null) {
			return false;
		}
		if(input.length() == 4 || input.length() == 6  ) {
			return input.chars().allMatch(Character::isDigit);
		}
		return false;
	}
}
