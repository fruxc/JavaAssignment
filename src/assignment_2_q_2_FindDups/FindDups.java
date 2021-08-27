package assignment_2_q_2_FindDups;

import java.util.*;

public class FindDups {

	static final Comparator<String> IGNORE_CASE_ORDER = new Comparator<String>() {
		public int compare(String string1, String string2) {
			return string1.compareToIgnoreCase(string2);
		}
	};

	public static void main(String[] args) {

		SortedSet<String> wordsFromArgs = new TreeSet<String>(IGNORE_CASE_ORDER);
		for (String newWord : args) {
			wordsFromArgs.add(newWord);
		}
		System.out.println(wordsFromArgs.size() + " distinct words: " + wordsFromArgs);
	}
}