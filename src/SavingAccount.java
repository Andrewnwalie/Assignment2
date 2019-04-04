
/**
 * 
 * @Group 14
 * @member: Chen Zhang R#:11538728
 * @member: Colyn Whittemore R#:11550115
 * @member: Jan Zverina R#:11633779
 *
 */

public class SavingAccount extends Account {
	private double rate;

	SavingAccount(int id, String name, char type, double balance, double rate) {
		super(id,name,type,balance);
		this.rate = rate;
	}

	public boolean addInterest() {
		if (accountType == 'S') {
			balance += balance*rate;
			return true;
		}
		return false;
	}

	public void deductLoan(double amount) {
		withdraw(amount);
	}

}
