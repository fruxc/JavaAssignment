package assignment_2_q_3_String_Trim;

import java.util.*;

public class Trim {
	static void listTrim(List<String> strings) {
		for (ListIterator<String> lit = strings.listIterator(); lit.hasNext();) {
			lit.set(lit.next().trim());
		}
	}

	public static void main(String[] args) {
		List<String> l = Arrays.asList(" red ", " white ", " blue ", " orange ", " green ");
		listTrim(l);
		for (String s : l) {
			System.out.println(s);
		}
	}
}