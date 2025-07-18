class Customer {
    String name = "Ram";
}

class AccountHolder extends Customer {
    int accountNumber = 2324234;
}

class LoanCustomer extends AccountHolder {
    int loanAmount = 100000;
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        LoanCustomer loanCustomer = new LoanCustomer();

        System.out.println("Name: " + loanCustomer.name);
        System.out.println("Account Number: " + loanCustomer.accountNumber);
        System.out.println("Loan Amount: " + loanCustomer.loanAmount);
    }
}
