public class Main {
    public static void main(String[] args) {
        
        System.out.println("Welcome to Credit Card App");

        CreditCard card = new CreditCard("8998", "Zaryab", 50000);
        card.spend(5000);
        card.payBill(2000);
        card.displayCardDetails();

///Loan class testing 
        Loan loan = new Loan("L001", "Zaryab", 5000, 100000, 7.5);
        loan.displayLoanDetails();
        try{
            loan.makePayment(-1000, true);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
         finally {
            System.out.println("Payment processing completed.");
        }
        loan.makePayment(1000,true);
        loan.makePayment(1000,false);

        loan.displayLoanDetails();
        System.out.println("Total Interest Charged: " + loan.getTotalInterestCharged());
        loan.displayPaymentHistory();


        Loan loan2 = new Loan("L002", "Meghna", 3000, 50000, 6.5);
        loan2.displayLoanDetails();
        loan2.makePayment(2000,true);
        loan2.makePayment(2000,false);
        loan2.makePayment(1000, true);
        loan2.makePayment(1000, false);
        loan2.displayLoanDetails();
        System.out.println("Total Interest Charged: " + loan2.getTotalInterestCharged());

    }

}