package Demo.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Userdata {
	
	  public static void main(String[] args) {

	        Scanner scanner=new Scanner(System.in);

	        /*   System.out.println("Enter number of list size");

	        int ListSize=s.nextInt();

	        List<String> listItems = new ArrayList<>();

	        System.out.println("enter elements");

	        for(int i=0;i<ListSize;i++){//for reading array
	        	listItems.add(s.next());

	        }
	        
            System.out.println(listItems);


	        for(String i: listItems){ //for printing array


	        }

*/
		  
		  
		  
	/*	  Scanner s=new Scanner(System.in);
	        String name=s.nextLine();
	        
	        String arr[] = name.split(",");
	        String arr1[]=new String[arr.length];
	        for(int i=0;i<arr.length;i++)
	        {
	            
	            arr1[i]=arr[i].replaceAll("^\"|\"$", "");
	        }
	        List<String> seq =  Arrays.asList(arr1);
	         
	        System.out.println(secMostRepeated(new Vector<>(seq)));
	       */ 
	        
	        int arCount = Integer.parseInt(scanner.nextLine().trim());

	        int[] ar = new int[arCount];

	        String[] arItems = scanner.nextLine().split(" ");

	        for (int arItr = 0; arItr < arCount; arItr++) {
	            int arItem = Integer.parseInt(arItems[arItr].trim());
	            ar[arItr] = arItem;
	        }

	    }
}
