public class Account extends AbstractBankAccount{

	// class variables
	private int bonusValue;
	private AccountType type;

	    
	    //overloaded constructor for Account
	    Account(String name, int num, int amt, AccountType type)
	    {
			super(name, num, (amt+calculateInitialBonusValue(amt)));
			bonusValue = calculateInitialBonusValue(amt);
			this.type=type;
	    }

		private static int calculateInitialBonusValue(int amt){
			//
			if (amt>=1 && amt <=100){
				return 10;
			} else if (amt <= 300){
				return 20;
			} else {
				return 30;
			}
		}

	    //make a deposit to the balance
	    public void deposit(int amt)
	    {
			if (amt>100){
				balance = (int) (balance + (amt+(int)bonusValue*0.1));
			} else {
				balance=balance+amt;
			}
	    }
	    //make a withdrawal from the balance
	    public void withdraw(int amt)
	    {
	    	    balance=balance-amt;
	    }

	@Override
	public int getBalance() {
		return balance;
	}

	//modifier to set the accountname
	    public void setaccountname(String name)
	    {
	    	    accountname = name;
	    }
	  //modifier to set the accountnumber
	    public void setaccountnum(int num)
	    {
	    	    accountnum = num;
	    }
	  //modifier to set the balance
	    public void setbalance(int num)
	    {
	    	    balance = num;
	    }
	  //accessor to get the accountname
	    public String getaccountname ( ) {
	    	 
	    	return accountname;
	    }
	    
	  //accessor to get the accountnumber
	    public int getaccountnum ( ) {
	   	 
	    	return accountnum;
	    }
	  //accessor to get the account balance
	    public int getbalance ( ) {
	      	 
	    	return balance;
	    }

	@Override
	public String getBankName(){
		return BANK;
	}

	@Override
	public String toString(){
		return "\nAccountType : " + this.type + super.toString();
	}
	    
	    //print method 
		public void print() {
			System.out.print("\nBank Name: "+getBankName()+
					"\nAccount Holder: "+ accountname+
					"\nAccount Number: "+ accountnum+
					"\nBalance: $"+ balance +
					"\n");
		}
	}
