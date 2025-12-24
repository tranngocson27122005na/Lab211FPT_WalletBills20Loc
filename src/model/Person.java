
package model;

public class Person {
    private int[] bills;
    private Wallet wallet;

    public Person(int[] bills, Wallet wallet) {
        this.bills = bills;
        this.wallet = wallet;
    }

    public int[] getBills() {
        return bills;
    }

    public void setBills(int[] bills) {
        this.bills = bills;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    
   
}//end class
