/*
*  created date: Mar 23, 2022
*  author: cgm
*/
package k14dhpm2.tuan6.buoi12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int denominator = 0;
        int result = 0;
        int numerator = 0;
        System.out.print("Numerator: ");
        try {
            numerator = scanner.nextInt();// Exception =>
            // Dung vaf khong lam bat cu lenh nao phia sau Exception

        } catch (InputMismatchException ex) {
            System.out.println("Loi roi tia oi!!!");
            System.out.println("Ban nen nha so nha!!!");
            ex.printStackTrace();
        }

        try {
            System.out.print("Denominator: ");
            denominator = scanner.nextInt();
            result = numerator / denominator;
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }catch(ArithmeticException exception){
            exception.printStackTrace();
        }


        System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);

    }

}
