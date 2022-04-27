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
		
		if(myNum <2) { //가드컨디션 : 프로그램이 돌아가기전에 기재한 숫자가 유효한지 확인
			return false;
		}
		
		for(int i = 2; 2 <= myNum-1;  i++) {
		if(myNum % i == 0) { 
			return false;
		}
	}
		return true;
	}
	
	
	public int sumUptoN() {
		
		int sum = 0;
		
		for(int i = 1; i <= myNum; ++i) {
			sum = sum + i;
		}
		
		return sum;
	}
	
	
	
	

}
