package machine;

import java.util.Scanner;

public class CoffeeMachine extends MachineSupply {


    public CoffeeMachine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        super(water, milk, coffeeBeans, disposableCups, money);
    }


    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            System.out.println("buy, fill, take, remaining, exit:\n");

            String action = scanner.nextLine();

            if (action.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                switch (scanner.nextLine()) {

                    case "1":
                        if (coffeeMachine.water - 250 > 0 && coffeeMachine.coffeeBeans - 16 > 0 && coffeeMachine.disposableCups > 0) {
                            coffeeMachine.water -= 250;
                            coffeeMachine.coffeeBeans -= 16;
                            coffeeMachine.disposableCups -= 1;
                            coffeeMachine.money += 4;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        } else if (coffeeMachine.water - 250 < 0) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (coffeeMachine.coffeeBeans - 16 < 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else if (coffeeMachine.disposableCups == 0) {
                            System.out.println("Sorry, not enough disposable cups");
                            break;
                        }
                    case "2": {
                        if (coffeeMachine.water - 350 > 0 && coffeeMachine.milk - 75 > 0 && coffeeMachine.coffeeBeans - 20 > 0 && coffeeMachine.disposableCups > 0) {
                           coffeeMachine.water -= 350;
                           coffeeMachine.milk -= 75;
                           coffeeMachine.coffeeBeans -= 20;
                           coffeeMachine.disposableCups -= 1;
                           coffeeMachine.money += 7;
                           System.out.println("I have enough resources, making you a coffee!");
                           break;
                        } else if (coffeeMachine.water - 350 < 0) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (coffeeMachine.milk - 75 < 0) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if (coffeeMachine.coffeeBeans - 16 < 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else if (coffeeMachine.disposableCups == 0) {
                            System.out.println("Sorry, not enough disposable cups");
                            break;
                        }

                    }
                    case "3": {
                        if (coffeeMachine.water - 200 > 0 && coffeeMachine.milk - 100 > 0 && coffeeMachine.coffeeBeans - 12 > 0 && coffeeMachine.disposableCups > 0) {
                            coffeeMachine.water -= 200;
                            coffeeMachine.milk -= 100;
                            coffeeMachine.coffeeBeans -= 12;
                            coffeeMachine.disposableCups -= 1;
                            coffeeMachine.money += 6;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        } else if (coffeeMachine.water - 200 < 0) {
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (coffeeMachine.milk - 100 < 0) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if (coffeeMachine.coffeeBeans - 12 < 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            break;
                        } else if (coffeeMachine.disposableCups == 0) {
                            System.out.println("Sorry, not enough disposable cups");
                            break;
                        }
                    }
                    case "back": {
                        break;
                    }
                }

            } else if (action.equals("fill")) {
                System.out.println("Write how many ml of water you want to add:");
                coffeeMachine.water += scanner.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                coffeeMachine.milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add: ");
                coffeeMachine.coffeeBeans += scanner.nextInt();
                System.out.println("Write how many disposable cups you want to add: ");
                coffeeMachine.disposableCups += scanner.nextInt();
            } else if (action.equals("take")) {
                System.out.println("I gave you $" + coffeeMachine.money + "\n");
                Hello_Advert(coffeeMachine.water, coffeeMachine.milk, coffeeMachine.coffeeBeans, coffeeMachine.disposableCups, 0);
                break;
            } else if (action.equals("remaining")) {
                Hello_Advert(coffeeMachine.water, coffeeMachine.milk, coffeeMachine.coffeeBeans, coffeeMachine.disposableCups, coffeeMachine.money);
            } else if (action.equals("exit")) {
                break;
            }

        }


    }

}


