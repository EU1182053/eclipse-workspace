package types;
interface A{
	void test();
}
interface B extends A{
	void demo();
}
class Test implements B{
	@Override
	public void test() {
		// TODO Auto-generated method stub
	}
	@Override
	public void demo() {
		// TODO Auto-generated method stub
	}
}
interface StackIntf{
	void push(Object ob);
	Object delete();
}

interface QueueIntf{
	void insert (Object ob);
	Number delete();
}
/*interface can extend multiple interfaces*/
interface CollectIntf extends StackIntf, QueueIntf{
	Object pop();
}
class Test2 implements CollectIntf{

	@Override
	public void push(Object ob) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Number delete() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Object ob) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	
}

class X{
	
}

interface Y{
	
}

class Z extends X implements Y
{
	
}


interface Outer{
	void test();
	interface Inner{
		void demo();
	}
}

class M implements Outer.Inner,Outer{
	@Override
	public void demo() {
		// TODO Auto-generated method stub
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
	}
}

abstract class Outer1{
	private int a;  // member of class, within class
	 abstract void test(); // abstract methods can not be private
	public interface Inner1{    // within a class
		void demo();
	}
	
	class InnerClass implements Inner1{
		@Override
		public void demo() {
			// TODO Auto-generated method stub
		}
	}
}
class N extends Outer1 implements Outer1.Inner1{
	@Override
	public void demo() {
		// TODO Auto-generated method stub
	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		
	}
}

public class TypesDemo {
public static void main(String[] args) {
	
}
}