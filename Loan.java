import java.util.ArrayList;

public class Loan {
    private String loanID;
    private String customerName;
    private double EMI;
    private double loanAmount;
    private double interestRate;
    private double outstandingBalance;
    private ArrayList<Payment> paymentHistory;
    private static final int MAX_HISTORY = 12;

    public Loan(String loanID, String customerName, double EMI, double loanAmount, double interestRate) {
        this.loanID = loanID;
        this.customerName = customerName;
        this.EMI = EMI;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.paymentHistory = new ArrayList<>();
        this.outstandingBalance = loanAmount;
    }

    public String getLoanID() {
        return this.loanID;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public double getEMI() {
        return this.EMI;
    }

        public double getLoanAmount() {
            return this.loanAmount;
        }

    public double getInterestRate() {
        return this.interestRate;
    }

    public double getOutstandingBalance() {
        return this.outstandingBalance;
    }

    public void makePayment(double amountPaid, Boolean paidOnTime) {
        interestRate = 0;
        if(paidOnTime){
            System.out.println("Payment made on time.");
            outstandingBalance -= amountPaid;
        }
        else{
                double interestRate = outstandingBalance * 2.5 / 100;
                outstandingBalance += interestRate;
                outstandingBalance -= amountPaid;
                System.out.println("Payment made after due date. Interest of 2.5% has been added to the outstanding balance." + interestRate );
        }
        paymentHistory.add(new Payment(paymentHistory.size() + 1, amountPaid, paidOnTime, interestRate, outstandingBalance));


    }
    
    public void displayLoanDetails() {
        System.out.println("Loan ID: " + loanID + "\n" + "Customer Name: " + customerName + "\n" + "EMI: "+ EMI+ "\n" + "Loan Amount: " + loanAmount+ "\n" + "Interest Rate: " + interestRate + "\n Outstanding Balance: " + outstandingBalance);
    }

    public void displayPaymentHistory(){
        for(Payment payment : paymentHistory){
            payment.displayPaymentDetails();
        }
    }

    public double getTotalInterestCharged() {
        double totalInterest = 0;
        for(Payment payment : paymentHistory){
            totalInterest += payment.getInterestRate();
        }
        return totalInterest;
    }
}