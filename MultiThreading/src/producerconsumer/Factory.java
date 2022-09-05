package producerconsumer;

public class Factory {

	private volatile int product=0;
	private volatile boolean flag=false;
	
	public void produced() {
		
		
	}
	public void consumed() {
		
	}
	public Factory() {
		
	}
	@Override
	public String toString() {
		return "Factory [product=" + product + ", flag=" + flag + "]";
	}
	public int getProduct() {
		return product;
	}
	public void setProduct(int product) {
		this.product = product;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
