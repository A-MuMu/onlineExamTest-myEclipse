package rainbow.example.util;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.CHAR_ARRAY;

public class String2List {
	
	public static String[] change(String string){
		final String regex = ",";//×Ö·û´®µÄ·Ö¸ô·û 
		return string.split(regex);
	}

}
