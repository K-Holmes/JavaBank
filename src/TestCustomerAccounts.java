public class TestCustomerAccounts {
    //master test class to check all class related info
    public static void main(String[] args) {
        AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];

        bankAccount[0] = new Account("Sanjay Gupta",11556,300);
        bankAccount[1] = new Account("He Xai", 22338, 500);
        bankAccount[2] = new Account("Ilya Mustafana", 44559, 1000);

        bankAccount[3] = new CreditAccount("A.N Other", 88776, 500);
        bankAccount[4] = new CreditAccount("Another",66778,1000,500);

        showAllCustomerAccounts(bankAccount);
        showAllAccounts(bankAccount);
        showAllCreditAccounts(bankAccount);
    }

    public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccounts){
        System.out.println("\nAll Customer Accounts");
        for (AbstractBankAccount act: bankAccounts){
            System.out.println(act);
        }
    }

    public static void showAllAccounts(AbstractBankAccount[] bankAccounts){
        System.out.println("\nAll Accounts");
        for (AbstractBankAccount act: bankAccounts){
            if (act instanceof Account){
                System.out.println(act);
            }
        }
    }

    public static void showAllCreditAccounts(AbstractBankAccount[] bankAccounts){
        System.out.println("\nAll Credit Account Types");
        for (AbstractBankAccount act: bankAccounts){
            if (act instanceof CreditAccount){
                System.out.println(act);
            }
        }
    }
}
