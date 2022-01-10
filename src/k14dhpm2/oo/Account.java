/*
*  created date: Jan 10, 2022
*  author: cgm
*/
package k14dhpm2.oo;

public class Account {

    //data
    int account_number = 12345;
    int account_balance;

    //operation
    //functions
    void deposit(int amount){

        //code
        account_balance += amount;

    }

    void withdraw(int amount){

        //code
        account_balance -= amount;

    }

    void show(){
        System.out.println("Thông tin của tài khoản: " );
        System.out.println("Account number: " + account_number);
        System.out.println("Account balance: " + account_balance);
        //code
    }



    
}
