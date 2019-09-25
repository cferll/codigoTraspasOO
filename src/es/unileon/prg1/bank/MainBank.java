package es.unileon.prg1.bank;

class MainBank {
	public static void main(String args[]) {
		BankAccount myAccount;
		int someMoney, theBalance;
		
		Person aPerson, who;
		aPerson = new Person("John");
		myAccount = new BankAccount(aPerson);
		
		someMoney = 5000;
		myAccount.deposit(someMoney);
		theBalance = myAccount.getBalance();
		who = myAccount.getOwner();
		System.out.println("The balance for " + who + " is " + theBalance);
	}
}