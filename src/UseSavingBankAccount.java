/**
 * 
 * @Group 14
 * @member: Chen Zhang R#:11538728
 * @member: Colyn Whittemore R#:11550115
 * @member: Jan Zverina R#:11633779
 *
 */

public class UseSavingBankAccount{
	public static SavingAccount account_arr[];
	
	public static void initAccounts() {
		account_arr = new SavingAccount[50];
		for (int i=0;i<50;i++) {
			account_arr[i] = new SavingAccount((i+1),"TTU"+(i+1),'C',0.0,5.0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initAccounts();
		GUI gui = new GUI();
	}
}
