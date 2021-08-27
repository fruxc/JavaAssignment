package assignment_1_q_4_Synchronized;

import java.util.Scanner;

public class SynchronizedMain {

	public static void main(String[] args) throws Exception {
		SynchronizedMessage synchronizedMessage = new SynchronizedMessage();
		Thread read = new ReadThread(synchronizedMessage);
		System.out.println("Starting read thread:");
		read.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new message to write on Synchronized Variable through thread: ");
		Thread write = new WriteThread(synchronizedMessage, sc.nextLine());
		System.out.println("Starting write thread:");
		write.start();
		sc.close();
	}
}
