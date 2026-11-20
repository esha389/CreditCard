public class CreditCard {
    private String cardNumber;
    private String holderName;
    private double creditLimit;
    private double availableCredit;
 
 
    public CreditCard(String cardNumber, String holderName, double creditLimit) 
    {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.availableCredit = creditLimit;
    }


    public String getCardNumber() {
        return this.cardNumber;
    }


    public String getHolderName() {
        return this.holderName;
    }


    public double getCreditLimit() {
        return this.creditLimit;
    }


    public double getavailableCredit() {
        return this.availableCredit;
    }


    public void spend(double amount) {
        availableCredit -= amount;
    }

    public void payBill(double amount) {
        availableCredit += amount;
    }

    public void displayCardDetails() {

        System.out.println("Credit Card Number :" + cardNumber);
        System.out.println("Card Holder Name :" + holderName);
        System.out.println("Credit Limit: " + creditLimit);
        System.out.println("Available Credit :" + availableCredit);


    }   
}