class BankAccount{
	private String accountHolderName;
	private double balance;

	public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public double getBalance() {
        return balance;
    }

	public void deposit(double amount){
		
		if(balance<0){
			System.out.println("Invalid amount");
		}
		else{
			setBalance(getBalance()+amount);
			System.out.println("Deposited amount: "+amount);
		}
	}

	public void withdraw(double amount){

		if (amount > 0 && amount <= getBalance()) {

            setBalance(getBalance() - amount);

            System.out.println("Withdrawn: " + amount);

        } else {

            System.out.println("Invalid withdraw amount.");
        }
	}

	public void displayBalance(){
		System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Current Balance: $" + getBalance());
	}
}