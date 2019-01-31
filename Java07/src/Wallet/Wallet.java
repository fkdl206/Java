package Wallet;

public class Wallet {
	static int wallet = 10000;

	public Wallet() {
		wallet =wallet- 1000 ;
	}
	
	public static int getWallet() {
		return wallet;   
	}
	
	
	
}
