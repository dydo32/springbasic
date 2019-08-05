package di.setter02;
public class Player implements AbstractPlayer {
	AbstractDice d;	//상위
	int totalValue=0;
	public Player() {}
	public Player(AbstractDice d) {
		super();
		this.d = d;
	}
	
	public AbstractDice getD() {
		return d;
	}
	public void setD(AbstractDice d) {
		System.out.println("Player setter메소드");
		this.d = d;
	}
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}