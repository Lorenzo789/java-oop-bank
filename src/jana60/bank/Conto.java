package jana60.bank;

public class Conto {

	private int numberCount;
	private String name;
	private int balance;
	
	
	public Conto(int numberCount, String name) {
		
		this.numberCount = numberCount;
		this.name = name;
		this.balance = 0;
	}

	public int getNumber() {
		return numberCount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int addMoney(int moneyToAdd) {
		if(moneyToAdd > 0) {
			
			return balance += moneyToAdd;
		}
		return balance;
		
	}
	
	public int withdrawMoney(int moneyToWithdraw) {
		
		if(balance > 0) {

			return balance -= moneyToWithdraw;
		}
		return balance;
	}
	
	
	
	
	@Override
	public String toString() {
		return "number count: " + numberCount
				+ "\nName owner: " + name;
	}
}
