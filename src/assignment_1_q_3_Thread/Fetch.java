package assignment_1_q_3_Thread;

public class Fetch extends Thread {

	public Fetch(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("MyThread - START " + Thread.currentThread().getName());
		try {
			// Get database connection, delete unused data from DB
			fetchData();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread - END " + Thread.currentThread().getName());
	}

	private void fetchData() throws InterruptedException {
		Thread.sleep(5000);
	}

}