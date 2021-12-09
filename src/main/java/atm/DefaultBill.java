package atm;

import atm.Bill;

public class DefaultBill implements Bill {
    private Bill next;
    private final int billAmount;

    public DefaultBill(int billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public void setNext(Bill next) {
        this.next = next;
    }

    @Override
    public void process(int amount) {
        if (next != null){
            next.process(amount % billAmount);
        }
        else if (amount % billAmount != 0){
            throw new IllegalArgumentException();
        }
        System.out.println("Please receive " + amount/billAmount + " of " + billAmount + " UAH bills.");
    }
}
