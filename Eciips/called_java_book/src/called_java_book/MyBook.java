package called_java_book;

public class MyBook {

	public static void main(String[] args) {
	
		JavaBook artOfComputerProgramming = new JavaBook(100);
		JavaBook EffectiveJava = new JavaBook(100);
		JavaBook cleanCode = new JavaBook(100);
		JavaBook None = new JavaBook();
		
		artOfComputerProgramming.MyBook();
		EffectiveJava.MyBook();
		cleanCode.MyBook();
		
		artOfComputerProgramming.setNoOfCopies(50);
		EffectiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(50);
		
		artOfComputerProgramming.increaseBook(30);
		EffectiveJava.decreaseBook(60);
		cleanCode.decreaseBook(20);
		
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(EffectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		System.out.println(None.getNoOfCopies());
	}

}
