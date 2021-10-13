
public class BankAccount {
		
		private double balance;
		private int number;
		private String AccountName;
		private String name;
		private boolean overdrawn;

		/**
		 Constructs a bank account with a zero balance
		 */
		public BankAccount(String name,int number,double balance,boolean overdrawn) {
		this.balance = balance; 
		this.number = number;
		this.name = name;
		this.overdrawn = overdrawn;
		
		}
		
		/**
		 Constructs a bank account with a given balance
		@param initialBalance the initial balance
		 */
		public BankAccount(double initialBalance) {
		balance=initialBalance;
		}
		/**
		 Deposits money into the bank account.
		@param amount the amount to deposit
		 */
		public void deposit (double amount) {
		balance = balance + amount;
		if(balance >= 0)
		{
			overdrawn = false;
			
		}
		
		}
		/**
		 Withdraws money from the bank account.
		@param amount the amount to withdraw.
		 */
		public void withdraw (double amount) {
			if(!overdrawn) {
				balance=balance-amount;
				if(balance< -1)
				{
					overdrawn = true;
				}
			}
			
			else {
				System.out.println("Negative amount!");
			}
		
	
		
		}
		/**
		 Gets the current balance of the bank account.
		@return the current balance
		 */
		public double getBalance() {
		return balance;
		}
		
		public int getAccountNum() {
			return number;
		}
		
		public void AccountNum(int number) {
			number = number;
		}
		
		public String getAccountName() {
			return AccountName;
		}
		
		public void AccountName() {
			name = name;
		}

		public boolean getOverDrawn() {
			return overdrawn;
		}
		
		public void Overdrawn() {
			overdrawn = overdrawn;
		}
		
		public void transfer(double amount, BankAccount otherAccount) {
			withdraw(amount);
			otherAccount.deposit(amount);
		}
		public void addInterest() {
			
			balance = balance + (balance * .035);
		}
		public String toString() {
			
			
			if(overdrawn == true)
			{
				return "The Account Number " + number + " is owned by " + name + " with a Balance " + balance + ". ";
			}
			else {
				return "The Account Number " + number + " is owned by " + name + " with a Balance " + balance + ". ";
			}
			
			
		}
		public boolean isOverDrawn() {
			return overdrawn;
		}
		public void setOverDrawn(boolean status) {
			overdrawn = status;
		}
		
		public String overDrawnStatus()
		{
			if(balance >= 0)
			{
				return " It is not overdrawn ";
			}
			else
			{
				return " It is overdrawn. Negative Balance! ";
			}
		
	
		
		}
 }

