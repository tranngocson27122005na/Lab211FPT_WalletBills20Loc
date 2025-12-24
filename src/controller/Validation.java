
package controller;
import java.util.Scanner;
import model.*;

public class Validation {
    private static Scanner sc = new Scanner(System.in);
    public static int checkBills(String prompt, int min , int max){
        while (true) {            
            System.out.print(prompt);
            String input = sc.nextLine().trim();
            try {
//                System.out.println("Input of Bills");
                int bills = Integer.parseInt(input);
                if(bills >= min && bills <= max ){
                    return bills;
                }else {
                    System.err.println("Number of bills, Input again: ");
                }
            } catch (Exception e) {
                System.err.println("NOT number of bills: ");
            }
        }
    }
    
    public static int checkMoney(String prompt){
        while (true) {            
            System.out.print(prompt);
            String money = sc.nextLine().trim();
            
            try {
                int check = Integer.parseInt(money);
                if(check > 0) return check;
                System.err.println("Money > 0, Input again: ");
                
            } catch (Exception e) {
                System.err.println("Not is valid of Money, input again: ");
            }
        }
    }
    
}//end class
