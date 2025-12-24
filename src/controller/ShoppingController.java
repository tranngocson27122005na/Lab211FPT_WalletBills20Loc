
package controller;
import model.Wallet;
import model.BillCaculate;


public class ShoppingController {
    public void run(){
        System.out.println("======= Shopping Calculate =======");
        
        int n = Validation.checkBills("input number of bills: ", 1, 5);
        int[] bill = new int[n];
        
        for (int i = 0; i < n; i++) {
            bill[i] = Validation.checkMoney("input value of bills " +(i+1)+ ": ");
        }
        
        int money = Validation.checkMoney("input value of wallet: ");
        
        Wallet wallet = new Wallet(money);
        
        int total = BillCaculate.calcTotal(bill);
        System.out.println("this is total of bill: "+ total);
        
        if(BillCaculate.canPayBills(bill, wallet)){
            System.out.println("You can buy it.");
        } else {
            System.out.println("You can't buy it.");
        }
    }
    
}
