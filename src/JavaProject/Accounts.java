package JavaProject;

public class Accounts {
    String cName;
    String cAddress;
    String cSSN;
    int totalNumOfCheckingAccounts = 0;
    int totalNumOfSavingsAccounts = 0;
    int totalAccountsPerCustomer = 0;

    static String[] accountType = {"savings" , "checking"};
    double balance = 0.00;
    static int accountNum = 1111;
    static int totalAccounts = 0;



    /**
     * methods
     * createAccount()
     * input parameter : 1
     * output parameter : 1 (4 digits of created account #)
     * <p>
     * withDraw()
     * input parameter: 2
     * accountNum, amount
     * output :
     * <p>
     * deposit()
     * input parameter: 2
     * accountNum, amount
     * output :
     * <p>
     * balance()
     * input parameter: 1
     * accountNum
     * output parameter: 1
     * balance amount
     */
    public void totalAccountsPerCustomer(){
        int totalNumOfAccounts = totalNumOfCheckingAccounts +totalNumOfSavingsAccounts;
        System.out.println(totalNumOfAccounts);
    }

    public void createAccount2(String cAccountType) {

        boolean isAccountTypeAvailable = false;
        for (int i = 0; i < accountType.length; i++) {
            if (accountType[i].equalsIgnoreCase(cAccountType)) {
                totalAccounts++;
                totalAccountsPerCustomer++;
                accountNum++;
                isAccountTypeAvailable = true;
                break;
            }
        }
        if (isAccountTypeAvailable) {
            if (cAccountType.equalsIgnoreCase("checking")) {
                totalNumOfCheckingAccounts++;
            } else if (cAccountType.equalsIgnoreCase("savings")) {
                totalNumOfSavingsAccounts++;
            }
            System.out.println("A " + cAccountType + " account has been created." +
                    "\nNew account number is: " + accountNum);
        } else {
            System.out.println("Invalid data entered. Please enter correct type of account (savings or checking)");
        }

    }


    public double withDraw(int accountNum, double withdrawalAmt){
            balance = balance - withdrawalAmt;
            return balance;
    }

    public double deposit(int accountNum, double depositAmt) {
            balance = balance + depositAmt;
            return balance;
    }

    public double balance (int accountNum){
            return balance;
    }

    public double getBalance (){
        return balance;
    }

    public int getAccountNum (){
        return accountNum;
    }




}
