/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jethroy;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Jethroy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // menu list
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Jethroy Sigarilyo Store, how can i help you?\n Please enter Y");
        double totalcost = 0;
        double price = 0;
        int quantity = 0;
        double Subtotal = 0;

        String productname = "";
        String loop = reader.next();
        boolean check = false;
        while (loop.equalsIgnoreCase("Y")) {
            System.out.println("Please select item\n"
                    + "Product--------Price----Code\n"
                    + "Mighty          P60        1\n"
                    + "Marlboro        P50        2\n"
                    + "More            P10        3\n"
                    + "Winston         P15        4\n"
                    + "Aries           P25        5\n");


            System.out.println("Type the code and the quantity you want to purchase"); //code and quantity in one line
            int code = reader.nextInt();


            switch (code) {
                case 1:
                    price = 60;
                    productname = "Mighty";
                    check = true;
                    break;
                case 2:
                    price = 50;
                    productname = "Marlboro";
                    check = true;
                    break;
                case 3:
                    price = 10;
                    productname = "More";
                    check = true;
                    break;
                case 4:
                    price = 15;
                    productname = "Winston";
                    check = true;
                    break;
                case 5:
                    price = 25;
                    productname = "Aries";
                    check = true;
                    break;

            }

            if (check == true) {
                System.out.println("You selected " + productname + " * " + price + " = PHP " + "\nEnter quality");
                quantity = reader.nextInt();
                double subtotal = price * quantity;

                totalcost += subtotal;
                System.out.println("Your Subtotal is " + totalcost);
                //Ask if user want order another item
                System.out.println("Do you want to order another item? (yes/no)");
                loop = reader.next(); //update 'loop' for the loop condition
            }

            if (loop.equalsIgnoreCase("N")) {
                System.out.println("Total: PHP " + totalcost);

                //Ask user to enter the payment amount
                double payment = 0.0;
                do {
                    System.out.println("Please enter the amount of money to pay: ");
                    payment = reader.nextDouble();

                    // Check if payment is sufficient
                    if (payment < totalcost) {
                        System.out.println("Insufficient funds. You need at least exact amount of money ");
                    } else {
                        double change = payment - totalcost;
                        System.out.println("Payment accepted. Your change is PHP " + change + "\nThank you for shopping at Jethroy Sigarilyo Store!");

                    }
                } while (payment < totalcost);
                check = true;
                System.out.println("---------------------------------------");

            }
        }
    }
}
