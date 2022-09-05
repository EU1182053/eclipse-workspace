
public class MainSyntaxInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		double sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Double.parseDouble(args[i]);
		}
		System.out.println("double" + sum);
		int a[] = { 1, 23, 34, 5657, 423 };

		main(a);
	}

	public static void main(int[] a) {
		// TODO Auto-generated method stub

	}

}
