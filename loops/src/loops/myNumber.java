package loops;

public class myNumber {
	
	private int myNum;

	myNumber(int myNum){
		this.myNum = 0;
	}
	
	public int getMyNum() {
		return myNum;
	}
	
	public void setMyNum(int Num) {
		this.myNum = Num;
	}
	
	
	public boolean isPrime() {
		
		if(myNum <2) {
			return false;
		}
		
		for(int i = 2; 2 <= myNum-1;  i++) {
		if(myNum % i == 0) { 
			return false;
		}
	}
	return true;
}
	
	
	
	
	

}
