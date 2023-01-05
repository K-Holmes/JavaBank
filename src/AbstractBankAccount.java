abstract public class AbstractBankAccount {

    AbstractBankAccount(String name, int num,int amt)
    {
        accountname=name;
        accountnum=num;
        balance=amt;
    }
    public final String BANK = "Java Bank";
    protected String accountname;
    protected int accountnum;
    protected int balance;

    abstract public void deposit(int amt);
    abstract public void withdraw(int amt);
    abstract public int getBalance();
    abstract public String getBankName();

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
    public String toString(){
        return "\nBank Name: "+ getBankName()+
                "\nAccount Holder: "+ accountname+
                "\nAccount Number: "+accountnum+
                "\nBalance: $"+balance;
    }

}
