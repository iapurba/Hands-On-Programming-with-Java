public class BankAccount {
    private String accountNo;
    private double balance;
    private String customerName;
    private String email;
    private String mobileNo;

    public BankAccount() {
        this("13131213", 1000, "default name",
                "default email", "default mob.no");
        System.out.println("Empty Constructor called");
    }
    // Constructor overloading
    public BankAccount(String accountNo, double balance, String customerName,
                       String email, String mobileNo) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.mobileNo = mobileNo;
    }
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Your A/c is credited with Rs. " + depositAmount +
                ". Available balance: Rs. " + this.balance);
    }
    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount > this.balance) {
            System.out.println("Your A/c does not have sufficient balance. Withdrawal not proceed.");
        }
        else {
            this.balance -= withdrawalAmount;
            System.out.println("Your A/c is debited with Rs. " + withdrawalAmount +
                    ". Available balance: Rs. " + this.balance);
        }
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String name) {
        this.customerName = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getAccountNo() {
        return this.accountNo;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

}
