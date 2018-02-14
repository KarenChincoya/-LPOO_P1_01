class BankAccount {
	private Integer accountNumber;
	private String ownerName;
	private Double accountBalance;
	public BankAccount(){
		this.accountNumber = 9999;
		this.ownerName = "Karen Velasco";
		this.accountBalance = 0.0;
	}
	public void setAccountNumber(Integer accountNumer){
		this.accountNumber = accountNumber;
	}
	public Integer getAccountNumber(){
		return accountNumber;
	}
	public void setOwnerName(String OwnerName){
		this.ownerName = ownerName;
	}
	public String getOwnerName(){
		return ownerName;
	}
	public void setAccountBalance(Double accountBalance){
		this.accountBalance = accountBalance;
	}
	public Double getAccountBalance(){
		return accountBalance;
	}
	public void displayData(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Owner's name: "+ ownerName);
		System.out.println("Account Balance: "+ accountBalance);
		explainAccountPolicy();
	}
	private void deductMonthlyFee(){
		accountBalance = accountBalance-4;
	}
	public static void explainAccountPolicy(){
		System.out.println("The $4 service fee will be deducted each month.");
	}

}
