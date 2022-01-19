package main;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(totalPoints(new String[]{"cat", "create", "sat"}, "caster"));
		System.out.println(totalPoints(new String[]{"trance", "recant"}, "recant"));
		System.out.println(totalPoints(new String[]{"dote", "dotes", "toes", "set", "dot", "dots", "sted"}, "tossed"));
	}
	
	public static int totalPoints(String[] guesses, String answer) {
		
		HashMap<Character, Integer> answerMap = buildMap(answer);
		int total = 0;
		for(String guess: guesses) {
			
			HashMap<Character, Integer> guessMap = buildMap(guess);
			boolean isValid = true;
			for(Character element: guessMap.keySet()) {
				if(!answerMap.containsKey(element) || answerMap.get(element) < guessMap.get(element)) {
					isValid = false;
					break;
				}
			}
			if(isValid) {
				total+=guess.length()-2;
				if(guess.length()==6) {
					total+=50;
				}
			}
			
		}
		
		return total;
	}
	
	public static HashMap<Character, Integer> buildMap(String input){
		
		HashMap<Character, Integer> inputMap = new HashMap<Character, Integer>();
		
		for(Character element: input.toCharArray()) {
			if(inputMap.containsKey(element)) {
				inputMap.replace(element, inputMap.get(element)+1);
			}else{
				inputMap.put(element, 1);
			}
		}
		
		return inputMap;
	}
}
