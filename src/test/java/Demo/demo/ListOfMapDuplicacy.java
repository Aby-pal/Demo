package Demo.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.java_cup.internal.runtime.Symbol;

public class ListOfMapDuplicacy {
	
	public static void main(String a[]) {
		
		/*List<Map<String, Object>> ad =new ArrayList<>();
		Map<String, Object> hello = new HashMap<>();
//		for (int i = 0; i < 5; i++) {
//			hello = new HashMap<>();
//			hello.put("1", 1);
//
//		}
		Map<String, Object> hello2 = new HashMap<>();

		hello.put("1", 1);
		ad.add(hello);
		hello.put("1", 2);
		ad.add(hello2);
		System.out.println("----------------------"+ad);
*/
		SimpleDateFormat sd = new SimpleDateFormat("MM-dd-yyyy");
		Calendar ca= Calendar.getInstance();
		System.out.println("Date :: "+Calendar.YEAR);
		System.out.println("Date :: "+Calendar.MONTH);
		System.out.println("Date :: "+Calendar.DAY_OF_MONTH);
		System.out.println("-----------"+sd.format(ca.getTime()));

		ca.add(Calendar.DAY_OF_MONTH, 7);



		System.out.println("-----------"+sd.format(ca.getTime()));
		
	}

}
