/*
*  created date: Jan 10, 2022
*  author: cgm
*/
package k14dhpm2.oo;

public class AcccountTestDrive {
    public static void main(String[] args) {


        Account account = new Account();
        
        account.show();
        account.deposit(500);
        account.show();
        account.withdraw(200);
        account.show();
    }
    
}
