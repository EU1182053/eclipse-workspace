package genericdemo;

public class MyStack {
		private int size;
		Object myArray[];
		private int top=-1;
		public MyStack(int size) {
			this.size = size;
			myArray=new Object[size];
		}
		public int currentsize() {
			return top+1;
		}
		public void push(Object o) {
			try {
			top++;
			myArray[top]=o;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		
		public Object pop() {
			try {
			if(top==-1)
				throw new StackUnderFlowException();
			 return myArray[top];
			}
			catch(StackUnderFlowException e) {
				System.out.println(e);
				return top;
			}
		}
		@Override
		public String toString() {
					String contents="";
				for(Object ob:myArray) {
					contents=contents+", "+ob;
				}
				return contents;
		}
		
		
		
}