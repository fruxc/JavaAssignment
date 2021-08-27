package assignment_2_q_1_Random_Print_Arguments;

import java.util.*;

public class RandomPrintArguments {

	public static void main(String[] args) {

		// Creating a list of given arguments
		List<String> argList = Arrays.asList(args);
		System.out.println(argList);
		Collections.shuffle(argList);

		System.out.println("Printing elements using stream");
		argList.stream().forEach(arg -> System.out.println(arg));

		System.out.println("Printing elements using enhanced for each loop");
		for (String arg : argList) {
			System.out.println(arg);
		}

		System.out.println("Printing elements using traditional for loop");
		for (int i = 0; i < argList.size(); i++) {
			System.out.println(argList.get(i));
		}
		System.out.println();
	}
}
