//1.[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetg broja n. Dupli faktorijel broja n je:
//n!! = n * (n-2) * (n-4) * ... * (2 ili 1)

package Domaci0912;

import java.util.Scanner;

public class DupliFaktorijel {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        int broj = s.nextInt();

        int faktorijel = 1;

        if(broj % 2 == 0){
            for(int i = 2; i <= broj; i += 2){
                faktorijel = faktorijel * i;
            }
        }
        else{
            for(int i = 1; i <= broj; i += 2){
                faktorijel = faktorijel * i;
            }
        }


        System.out.println("Faktorijel tog broja je " + faktorijel);
    }
}

