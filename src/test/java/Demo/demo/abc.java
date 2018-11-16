package Demo.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class abc {

	public static void main(String a[]) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("give");
	     String name=s.nextLine();
	     List<String> words = new ArrayList<>();
	     String[] b= name.split("\\s+");
	     System.out.println(b);
	}
	
}
