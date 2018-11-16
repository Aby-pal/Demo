package Demo.demo;

public class ReverseString {

	public static void main(String[] args) {
		String input="Software Testing Material";
		StringBuilder input1 = new StringBuilder(input);
//		input1.append(input);
//		input1=input1.reverse();
		System.out.println(input1);

		System.out.println(input1.length());
		for (int i=0;i<input1.length();i++) {
//			System.out.println(input1.length());

		System.out.print(input1.charAt(input1.length()-(i+1)));
//		System.out.println();
		}

	}
}
