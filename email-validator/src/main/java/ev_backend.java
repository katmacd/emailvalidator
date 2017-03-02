//Katharine MacDonald
//B00696392
//CSCI 3130 - Assignment 3

//Imports.
import java.util.ArrayList;


public class ev_backend {

	
	public static void main (String[]args){
	
	System.out.print("Welcome to Assignment #3, Email Validator.");
	
		
	}
	
	//Takes the string from main, and puts it into an array to check 
	public static boolean eChecker(String input){
		
		//String is broken down into an array.
		ArrayList<Character> parsethis = new ArrayList<Character>();
		for(int h = 0; h < input.length(); h++){
			
			parsethis.add(input.charAt(h));
			
		}
		
		//Simple boolean checks for finding @ and ., and .com, and is there no character at start.
		boolean at = false;
		boolean period = false;
		boolean isIt = false;
		
		
		//. check
		if(parsethis.contains('.')){
			period = true;
		}
		
		//At check
		for(int i = 0; i < parsethis.size(); i++){
			
			if(parsethis.get(i) == '@'){
				
				at = true;
				
			}
			
		}
		
		if(at && period){
			
			isIt = true;
			
		}
		
		return isIt;
		
	}
	
}
