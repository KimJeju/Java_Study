package loops;

public class whileNumberPlayer {

	private int Player;
	
	whileNumberPlayer(int Play) {
		this.Player = Play;
	}

	public void printSquaresUptoLimit() { //세제곱 출력을 위한 while문
		
		int i = 1;
		while(i*i <= Player) {
		System.out.println("printSquaresUptoLimit : " + i*i);
		i++;
		}
		
	}
	
	
	
}
