package producerconsumer;

public class ProducerConsumerDemo {
public static void main(String[] args) {
	System.err.println("Main thread Started.");
	
	Factory fact = new Factory();
	
	Thread pthread = new ProducerThread(fact);
	Thread cthread = new ConsumerThread(fact);
	
	pthread.setName("Producer");
	cthread.setName("Consumer");
	
	
	
}
}
