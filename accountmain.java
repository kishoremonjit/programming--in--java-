
class AccountMain {
    public static void main(String[] args) {
        // Create a SavingAccount object
        SavingAccount sa = new SavingAccount(
                1001, "John Doe", "New York", "9876543210",
                "1990-01-01", 5000.0
        );

        // Perform deposit and withdraw
        System.out.println("Initial Balance: " + sa.getBalance());

        sa.deposit(2000.0);    // Add money
        sa.withdraw(1500.0);   // Withdraw money
        sa.withdraw(6000.0);   // Try to withdraw more than balance
    }
}

class Account {
    protected int accNo;
    protected String name;
    protected String address;
    protected String phoneNo;
    protected String dob;
    protected double balance;

    // Constructor
    public Account(int accNo, String name, String address,
                   String phoneNo, String dob, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public void setAccNo(int accNo) { this.accNo = accNo; }
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }
    public void setDob(String dob) { this.dob = dob; }
    public void setBalance(double balance) { this.balance = balance; }


    public int getAccNo() { return accNo; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhoneNo() { return phoneNo; }
    public String getDob() { return dob; }
    public double getBalance() { return balance; }
}

class SavingAccount extends Account {
    public SavingAccount(int accNo, String name, String address,
                         String phoneNo, String dob, double balance) {
        super(accNo, name, address, phoneNo, dob, balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}