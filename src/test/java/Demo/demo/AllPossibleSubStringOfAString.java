package Demo.demo;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubStringOfAString {

	public static void recurse(String str, List<String> out)
    {
        // if all characters of the input String are processed,
        // print the output String
		System.out.println("\n -------------Out From loop----------------\n");
        if (str.length() == 0)
        {
            System.out.println("String length zero :: "+out);
            return;
        }

        // add each substring [0, i] in the output vector and recurse for 
        // remaining substring [i+1, n-1]
        for (int i = 0; i < str.length(); i++)   {
        	System.out.println("String length :: "+str.length());
     
            // push substring [0, i] into output vector
            out.add(str.substring(0, i + 1));
            
            System.out.println("Loop :: "+i + " list :: "+out);
 
            System.out.println("Before String :: "+str.substring(i + 1));
            // recurse for remaining String [i+1, n-1]
            recurse(str.substring(i + 1), out);
           

            System.out.println("After Recurse :: "+out);
            System.out.println("String :: "+str.substring(i + 1));
            // backtrack (remove current substring from vector)
            out.remove(out.size() - 1);
            
            System.out.println("After Remove :: "+out);
            System.out.println("Size :: "+(out.size() - 1));

        }
//        System.out.println("Sumit and Agam Answer :: "+out);
    }

    // main function
    public static void main(String[] args)
    {
        // input String
        String str = "ABCD";

        // output vector to store non-overlapping substrings
        List<String> out = new ArrayList<>();

        // Print all non-overlapping substrings
       recurse(str, out);
        
       
    }
}
