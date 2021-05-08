package JavaProject;

import java.util.Scanner;

public class Customer extends Accounts {
    int customerID;

    static int totalCustomers = 0;
    static int accountNumberMinimum = 1111;

    /**
     * Customer ->
     *      Name
     *      SSN
     *      Address
     *
     *      methods
     *          editDetails()
     *              input parameter : none
     *              output : show the updated info.
     *              make it interactive, ask user for the field wanna edit, and new value
     *          createAccount()
     *              input parameter : none
     *              if input is savings, create a savings account
     *              if input is checking, create a checking account
     *              if input is something else, show error
     *              make it interactive, ask user for account type
     *              show:
     *                  Savings account has been created.
     *                  Last 4-digits of account number is XXXX
     *          showAccountBalance()
     *              input parameter : none
     *              make it interactive, ask user for account number
     *              show:
     *                  Account number:
     *                  Balance:
     *          showAllAccountBalance()
     *              show:
     *                  You have total X account.
     *                  Account number:
     *                  Balance:
     *
     *                  Account number:
     *                  Balance:
     *
     *                  Account number:
     *                  Balance:
     *          makeWithdraw:
     *              make it interactive, ask user for account number
     *              if valid account number, then ask for amount
     *              if amount is valid, make withdraw happen
     *              show:
     *                  Please collect $XXXX.YY amount
     *                  Your updated balance: $NNNN.MM
     *          makeDeposit:
     *              make it interactive, ask user for account number
     *              if valid account number, then ask to enter the amount
     *              if amount is valid, make deposit happen
     *              show:
     *                  Amount has been deposited successfully
     *                  Your updated balance: $NNNN.MM
     *
     */
    public void Customer (String cName, String cSSN) {

        String customerName= cName;
        String SSN = cSSN;

        createAccount();

        totalCustomers++;
        customerID = totalCustomers;

    }

    public void Customer (String cName, String cSSN, String cAddress) {
        String name = cName;
        String SSN = cSSN;
        String address = cAddress;

        createAccount();

        totalCustomers++;
        customerID = totalCustomers;
    }

    public void createAccount(){

        Scanner input = new Scanner(System.in);

        System.out.println("Account type:");
        String accountType = input.next();

        createAccount2(accountType.toLowerCase());


    }

    //Couldn't figure out how to sout account number and balance of all accounts per customer, it shows only the last account number created.
    public void showAllAccountBalance(){
        System.out.println("You have " + totalAccountsPerCustomer + " account(s) in total.");

        getAccountNum();
        getBalance();

        System.out.println("Account number: " + accountNum + "\nBalance: " + balance);

    }


    public void editDetails () {
        Scanner input = new Scanner(System.in);
        System.out.println("Which field you would like to edit (Name/SSN/Address)?");
        String dataToEdit = input.next();


            if (dataToEdit.equalsIgnoreCase("name") == true) {
                System.out.println("Enter your updated name: ");
                String name = input.next();
                System.out.println("Your name is now updated to " + name);
            } else if (dataToEdit.equalsIgnoreCase("ssn") == true) {
                System.out.println("Enter your updated SSN: ");
                String SSN = input.next();
                System.out.println("Your SSN is now updated to " + SSN);
            } else if (dataToEdit.equalsIgnoreCase("address") == true) {
                System.out.println("Enter your updated address: ");
                String address = input.next();
                System.out.println("Your address is now updated to " + address);
            } else {
                System.out.println("Invalid data entered. Try again!!");

            }
    }


    public void showAccountBalance() {
        Scanner input = new Scanner(System.in);

        System.out.println("Account number:");
        String accountNumString = input.next();

        int accountNum = Integer.valueOf(accountNumString);

        if (accountNum > accountNumberMinimum && accountNum <= (accountNumberMinimum + totalCustomers)){
            System.out.println("Balance: " + balance(accountNum));
        } else {
            System.out.println("Invalid account number entered");
        }


    }



    public void makeWithdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("Account number:");
        String accountNumString = input.next();

        System.out.println("Withdrawal amount:");
        String withdrawalAmtString = input.next();


        int accountNum = Integer.valueOf(accountNumString);
        double withdrawalAmt = Double.valueOf(withdrawalAmtString);

        if (accountNum>accountNumberMinimum && accountNum <= (accountNumberMinimum+totalCustomers) && withdrawalAmt>0 && withdrawalAmt<balance) {
            withDraw(accountNum, withdrawalAmt);
            System.out.println("Amount withdrawn: $" + withdrawalAmt +
                    "\nYour updated balance: $" + balance);
        } else {
            System.out.println("Invalid data entered.");
        }
    }

    public void makeDeposit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Account number:");
        String accountNumString = input.next();

        System.out.println("Deposit amount:");
        String depositAmtString = input.next();


        int accountNum = Integer.valueOf(accountNumString);
        double depositAmt = Double.valueOf(depositAmtString);


        if (accountNum>accountNumberMinimum && accountNum <= (accountNumberMinimum+totalCustomers) && depositAmt>0) {
            deposit(accountNum, depositAmt);
            System.out.println("Amount deposited: $" + depositAmt +
                    "\nYour updated balance: $" + balance);
        } else if (accountNum<accountNumberMinimum && accountNum >= (accountNumberMinimum+totalCustomers) && depositAmt<0){
            System.out.println("Invalid data entered.");
        }

    }
}
