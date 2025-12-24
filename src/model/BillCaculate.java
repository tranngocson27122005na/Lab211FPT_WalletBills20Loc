package model;

public class BillCaculate {

    // Tính tổng bills
    public static int calcTotal(int[] bills) {
        int sum = 0;
        for (int bill : bills) {
            sum += bill;
        }
        return sum;
    }

    // Kiểm tra ví có đủ tiền trả bills không
    public static boolean canPayBills(int[] bills, Wallet wallet) {
        return calcTotal(bills) <= wallet.getMoney();
    }
}
