package es.unileon.prg1.bank;

class BankAccount {
	int balance;
	Person owner;

	BankAccount(Person owner) {
		this.owner = owner;
	}

	void deposit(int money) {
		this.balance += money;
	}

	void withdraw(int money) {
		this.balance -= money;
	}

	int getBalance() {
		return this.balance;
	}

	Person getOwner() {
		return this.owner;
	}
}
