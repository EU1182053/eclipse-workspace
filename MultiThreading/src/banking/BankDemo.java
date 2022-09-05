package banking;
/*Thread Synchronization : If multiple threads are working on shared resources (it is must) then
 * at some situation, some operations on shared resources need to be synched among threads so that
 * if any thread is working in synchronized method/ block of that resource then, 
 * other thread will wait until that thread will come out of synchronized method/ block of same resource*/
public class BankDemo {
	public static void main(String[] args) {
		System.out.println("Main thread started");
		BankAccount account=new BankAccount(333333,1212,"Salary",50000);
		DepositThread dthread=new DepositThread(account);
		dthread.setName("Deposit");
		dthread.start(); // call automatically goes to run of DepositThread
		
		WithdrawThread wThread=new WithdrawThread(account);
		wThread.setName("Withdraw");
		wThread.start(); // call automatically goes to run of WithdrawThread
		System.out.println("Main thread ended");
		/*currently parent thread is not waiting for childs to complete their execution
		 * solution : join method*/
	}
}