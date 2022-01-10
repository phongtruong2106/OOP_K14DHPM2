/*
*  created date: Jan 10, 2022
*  author: cgm
*/
package k14dhpm2.nonstructure;

import java.util.Scanner;

public class BankNonStructure {
    public static void main(String[] args) {
        //data - dữ liệu
        //các variables (biến)
        int account_number = 12345;// id của tài khoản
        int account_balance = 0;// số dư của tài khoản

        Scanner input = new Scanner(System.in);
        // các thao tác operation lên data
        //gửi tiền
        System.out.print("Nhập số tiền gửi > ");
        int inputAmount = input.nextInt();
        account_balance += inputAmount;

        //show
        System.out.println("Thông tin của tài khoản: " );
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);

        //withdraw - rút tiền
        int inputWithdrawAmount;
        System.out.print("Nhập số tiền rút > ");
        inputWithdrawAmount = input.nextInt();
        account_balance -= inputWithdrawAmount;

        //show
        System.out.println("Thông tin của tài khoản: " );
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);


        //withdraw - rút tiền
        System.out.print("Nhập số tiền rút > ");
        inputWithdrawAmount = input.nextInt();
        account_balance -= inputWithdrawAmount;
        //show
        System.out.println("Thông tin của tài khoản: " );
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);



    }
    
}
