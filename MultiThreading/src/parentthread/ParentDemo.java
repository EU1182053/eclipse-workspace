package parentthread;

public class ParentDemo {
	public static void main(String[] args) // root thread started from here
	{
		MathOperations op=new MathOperations();
		Thread mainthread=Thread.currentThread(); // currently executing thread object
		System.out.println(mainthread);// toString
		//Thread[main,5,main] 
		/* main : Thread Name : java name, setName
		 * 5 : priority : 1 to 10 : MIN_PRIORITY=1, MAX_PRIORITY=10, NORM_PRIORITY=5, setPriority
		 * main : thread group : we can  not change group of main thread
		 * ThreadGroup to assign group name to child threads
		 * 
		 * */
		mainthread.setPriority(Thread.MAX_PRIORITY-1); // 1 to 10
		System.out.println(mainthread.getPriority());
		mainthread.setName("root");
		System.out.println(mainthread.getName());
		System.out.println(mainthread);
		try {
			op.loop(3, 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Loop ended here.");
	}
}