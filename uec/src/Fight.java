import java.util.Random;

public class Fight {
	private Fighter challenged;
	private Fighter challenger;
	private int rounds;
	private boolean okay;
	
	public void markFight(Fighter f1, Fighter f2) {
		if (f1.getCategory().equals(f2.getCategory()) && f1 != f2) {
			this.setOkay(true);
			this.setChallenged(f1);
			this.setChallenger(f2);
		} else {
			this.setOkay(false);
			this.setChallenged(null);
			this.setChallenger(null);
		}
	}
	
	public void fight() {
		if (this.isOkay()) {
			this.getChallenged().toPresent();
			this.getChallenged().status();
			this.getChallenger().toPresent();
			this.getChallenger().status();
			
			Random random = new Random();
			
			int winner = random.nextInt(3);
			
			switch (winner) {
				case 0:
					System.out.println("Empatou!");
					System.out.println();
					this.getChallenged().tieFight();
					this.getChallenger().tieFight();
					break;
				case 1:
					System.out.println(this.getChallenged().getName() + " ganhou a luta!");
					System.out.println();
					this.getChallenged().winFight();
					this.getChallenger().loseFight();
					break;
				case 3:
					System.out.println(this.getChallenger().getName() + " ganhou a luta!");
					System.out.println();
					this.getChallenged().loseFight();
					this.getChallenger().winFight();
					break;
			}
			
		} else {
			System.out.println("Luta não pode acontecer!");
		}
	}

	public Fighter getChallenged() {
		return challenged;
	}

	public void setChallenged(Fighter challenged) {
		this.challenged = challenged;
	}

	public Fighter getChallenger() {
		return challenger;
	}

	public void setChallenger(Fighter challenger) {
		this.challenger = challenger;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isOkay() {
		return okay;
	}

	public void setOkay(boolean okay) {
		this.okay = okay;
	}
}
