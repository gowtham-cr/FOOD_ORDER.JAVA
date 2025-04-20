

import java.util.Scanner;

 public static void main(String[] args){
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Food Ordering System");
        System.out.println("Please choose an option from the menu:");
        System.out.println("1. masal dosa");
        System.out.println("2. rice bath");
        System.out.println("3. chapathi");
        System.out.println("4. vangibath");

        int choice = scanner.nextInt();
        String orderMessage;

        switch (choice) {
            case 1:
                System.out.println("You ordered a masal dosa.");
                System.out.println("your order will be placed within 2min");
                System.out.println("the price is 50");
                System.out.println("please make your payment");
                System.out.println("your payement is successfull");
                break;
            case 2:
                System.out.println("You ordered a rice bath.");
                System.out.println("your order will be placed within 2min");
                System.out.println("the price is 70");
                System.out.println("please make your payment");
                System.out.println("your payement is successfull");
                break;
            case 3:
                System.out.println("You ordered chapathi.");
                System.out.println("your order will be placed within 2min");
                System.out.println("the price is 50");
                System.out.println("please make your payment");
                System.out.println("your payement is successfull");
                break;
            case 4:
                System.out.println("You ordered a vangibath.");
                System.out.println("your order will be placed within 2min");
                System.out.println("the price is 60");
                System.out.println("please make your payment");
                System.out.println("your payement is successfull");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                System.out.println("your order is not placed");
                System.out.println("your payement is unsuccessfull");
                break;
        }

    }


    System.out.println();

}
