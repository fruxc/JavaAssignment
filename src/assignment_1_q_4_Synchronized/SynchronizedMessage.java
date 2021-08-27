package assignment_1_q_4_Synchronized;

public class SynchronizedMessage {
	private String message = "";

	public SynchronizedMessage() {
		if (message.isEmpty()) {
			this.message = "Message From Synchronized";
		}
	}

	public synchronized String read() {
		return message;
	}

	public synchronized String write(String newMessage) throws Exception {
		if (newMessage.isEmpty()) {
			throw new Exception("Entered message cannot be empty!!!");
		}
		this.message = newMessage;
		return this.message;
	}
}

class ReadThread extends Thread {
	private SynchronizedMessage t;

	ReadThread(SynchronizedMessage t) {
		this.t = t;
	}

	public void run() {
		System.out.println(t.read());
	}

}

class WriteThread extends Thread {
	private SynchronizedMessage t;
	private String message;

	WriteThread(SynchronizedMessage t, String message) {
		this.t = t;
		this.message = message;
	}

	public void run() {
		try {
			System.out.println(t.write(this.message));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
