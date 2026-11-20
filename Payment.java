public class Payment {
    private int month;
    private double amountPaid;
    private boolean paidOnTime;
    private double interestRate;
    private double outstandingBalance;

    public Payment(int month, double amountPaid, boolean paidOnTime, double interestRate, double outstandingBalance) {
       if (month < 1 || month > 12){
            throw new IllegalArgumentException("Month must be between 1 and 12.");
        }

        if (amountPaid < 0) {
            throw new IllegalArgumentException("Amount paid cannot be negative.");
        }
        this.month = month;
        this.amountPaid = amountPaid;
        this.paidOnTime = paidOnTime;
        this.interestRate = interestRate;
        this.outstandingBalance = outstandingBalance;
    }

    public int getMonth() {
        return this.month;
    }

    public double getAmountPaid() {
        return this.amountPaid;
    }

    public boolean isPaidOnTime() {
        return this.paidOnTime;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public double getOutstandingBalance() {
        return this.outstandingBalance;
    }
    public void displayPaymentDetails() {
        System.out.println("Month: " + month);
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Paid On Time: " + paidOnTime);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Outstanding Balance: " + outstandingBalance);
    }


}