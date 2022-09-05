package genericdemo;

public class MyStackDemo {
	public static void main(String[] args) {
		MyStack stack=new MyStack(10); // not typesafe
		stack.push(10);
		stack.push("hi");
		stack.push(10);
		stack.push("hello");
		System.out.println(stack);
		System.out.println(stack.currentsize());
		Object o=stack.pop(); //"hello"
		System.out.println(o);
		Integer i=(Integer)o;  // ClassCastException may occur
		System.out.println(i.doubleValue());
	}
}