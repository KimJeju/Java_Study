package loops;

public class myNumberRunner {

	public static void main(String[] args) {
		
		myNumber Number = new myNumber(5);
		boolean isPrime = Number.isPrime();
		System.out.println("is Prime" + isPrime);
		
		int sum = Number.sumUptoN();
		System.out.println("is sumUptoN" + sum);

	}

}
