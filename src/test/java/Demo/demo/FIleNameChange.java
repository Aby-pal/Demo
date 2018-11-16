package Demo.demo;

import java.io.File;

public class FIleNameChange {

	public static void main(String a[]) {
		File sdcard = new File("D:\\Demo\\");
		File from = new File(sdcard,"cde.xlsx");
		File to = new File(sdcard,"efg.xlsx");
		from.renameTo(to);

	}
}
