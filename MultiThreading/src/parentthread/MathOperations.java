package parentthread;

public class MathOperations {

	public void loop(int start, int end) throws InterruptedException {
		Thread current=Thread.currentThread();
		for(int i=start;i<=end;i++) {
			System.out.println(current.getName()+":"+i);
			Thread.sleep(1000);
		}
	}
	
	
}