import entities.Coin;
import entities.CoinFactory;
import entities.Coins;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        getUserCurrency();
    }

    public static void getUserCurrency() {
        int choice;
        System.out.println("What would you like to convert?");
        System.out.println("1. ILS to USD?");
        System.out.println("2. USD to ILS?");
        Scanner keyboard = new Scanner(System.in);
        choice = keyboard.nextInt();
        Coin coin;
//        double input = keyboard.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Please enter an amount to convert:");
                coin = CoinFactory.getCoinInstance(Coins.ILS);
                break;
            case 2:
                System.out.println("Please enter an amount to convert:");
                coin = CoinFactory.getCoinInstance(Coins.USD);
                break;
            default:
                System.out.println("Invalid Choice Please Try Again");
                Scanner secondKeyboard = new Scanner(System.in);
                choice = secondKeyboard.nextInt();
                throw new IllegalStateException("Unexpected value: " + choice);
        }

        double input = keyboard.nextDouble();
        System.out.println(coin.calculate(input));

    }

}
