package JavaProject;

public class Bank {
    public static void main(String[] args){
    /**
     * Class -> Bank, Customer, Accounts
     * <p>
     * One customer can have any number of account
     * Each customer will have unique customerId
     * Each account will have unique account number
     * <p>
     * <p>
     * Bank ->
     * main method
     * In this class, we will never create object of Accounts class.
     * In this class, we will never use methods/variables of Accounts class.
     * In this class, we will using Customer class.
     * In this class, creating one customer object means creating a customer
     * <p>
     * To create Customer,
     * customer has to enter 3 data
     * 1. Name
     * 2. SSN
     * 3. Type of account they want to open (Savings, Checking)
     * <p>
     * customer can enter 4 data
     * 1. Name
     * 2. SSN
     * 3. Address
     * 4. Type of account they want to open (Savings, Checking)
     * <p>
     * When creating object of Customer class,
     * if all data is given this should create an account as well.
     * <p>
     * Customer c1 = new Customer("name", 1234, "Savings");
     * show:
     * Congratulations for your new account.
     * Account number: 0909
     * <p>
     * c1.showAllAccountBalance();
     * show:
     * You have total 1 account.
     * Account number:
     * Balance:
     */



    //Practice customer 1
    Customer a1 = new Customer();
    a1.Customer("bla bla","19384893742");
                              a1.createAccount();
                              a1.makeDeposit();
                              a1.makeWithdraw();
                              a1.makeDeposit();
                              a1.showAccountBalance();
                              a1.editDetails();
                              a1.showAllAccountBalance();

    //Practice customer 2
    Customer b1 = new Customer();
    b1.Customer("Dona Smith","19384893742", "Boca Raton, FL 33456");
                               b1.makeDeposit();
                               b1.makeWithdraw();
                               b1.showAccountBalance();
                               b1.editDetails();
                               b1.showAllAccountBalance();

                                




    }

}
