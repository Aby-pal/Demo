package Demo.demo;

import java.util.regex.Pattern;

public class StringRegexMatcher {
	
	public static void main(String a[]) {
		 String input = "[45364356]";
	     Pattern pattern = Pattern.compile("\\[.*?\\]");
	     System.out.println("-------------------------- "+pattern.matcher(input).matches());
	    if (!pattern.matcher(input).matches()) {
	        throw new IllegalArgumentException("Invalid String");
	    }
	}// 
	
	

}
