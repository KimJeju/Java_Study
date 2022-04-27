package loops;

public class whileNumberPlayer {

	private int Player;
	
	whileNumberPlayer(int Play) {
		this.Player = Play;
	}

	public void printSquaresUptoLimit() {
		
		int i = 1;
		while(i*i <= 30) {
		System.out.println("printSquaresUptoLimit : " + i*i);
		i++;
		}
		
	}
	
	
	
}
