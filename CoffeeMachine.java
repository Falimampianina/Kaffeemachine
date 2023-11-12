package machine;

import java.util.*;

public class CoffeeMachine {
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;
    private int money=550;
    private final Scanner scanner = new Scanner(System.in);

    public String toString(){
        return "The coffee machine has:\n" +
                        water + " ml of water\n" +
                        milk + " ml of milk\n" +
                        coffeeBeans + " g of coffee beans\n" +
                        cups + " disposable cups\n" +
                        "$" + money + " of money";
    }

    public void buy(){
        System.out.println("What do you want too buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String id = scanner.next();
        int diffWater;
        int diffMilk;
        int diffCoffeeBeans;
        int diffCups;
        switch (id){
            case "1":
                diffWater = water - 250;
                diffCoffeeBeans = coffeeBeans - 16;
                diffCups = cups - 1;
                if (diffWater < 0){
                    System.out.println("Sorry not enough water!");
                    break;
                }else if (diffCoffeeBeans < 0) {
                    System.out.println("Sorry not enough coffee beans!");
                    break;
                }else if(diffCups < 0){
                    System.out.println("Sorry not enough disposable cups!");
                    break;
                }else{
                    water-=250;
                    coffeeBeans-=16;
                    money+=4;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
            case "2":
                diffWater = water - 350;
                diffMilk = milk - 75;
                diffCoffeeBeans = coffeeBeans - 20;
                diffCups = cups - 1;
                if (diffWater < 0){
                    System.out.println("Sorry not enough water!");
                    break;
                }else if (diffCoffeeBeans < 0) {
                    System.out.println("Sorry not enough coffee beans!");
                    break;
                }else if(diffCups < 0){
                    System.out.println("Sorry not enough disposable cups!");
                    break;
                }else if(diffMilk < 0){
                    System.out.println("Sorry not enough disposable milk!");
                    break;
                }else{
                    water-=350;
                    milk-=75;
                    coffeeBeans-=20;
                    money+=7;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
            case "3":
                diffWater = water - 200;
                diffMilk = milk - 100;
                diffCoffeeBeans = coffeeBeans - 12;
                diffCups = cups - 1;
                if (diffWater < 0){
                    System.out.println("Sorry not enough water!");
                    break;
                }else if (diffCoffeeBeans < 0) {
                    System.out.println("Sorry not enough coffee beans!");
                    break;
                }else if(diffCups < 0){
                    System.out.println("Sorry not enough disposable cups!");
                    break;
                }else if(diffMilk < 0){
                    System.out.println("Sorry not enough disposable milk!");
                    break;
                }else {
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    money += 6;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                    break;
                }
            default:
                start();
                break;
        }
    }

    public void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public void start(){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        switch (action){
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                System.out.println(this);
                break;
            case "exit":
                System.exit(0);
                break;
        }
    }

    public void fill(){
        System.out.println("Write how many ml of water you want to add:");
        int plusWater = scanner.nextInt();
        water+=plusWater;

        System.out.println("Write how many ml of milk you want to add:");
        int plusMilk = scanner.nextInt();
        milk+=plusMilk;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int plusCoffeeBeans = scanner.nextInt();
        coffeeBeans+=plusCoffeeBeans;

        System.out.println("Write how many disposable cups you want to add:");
        int plusCups = scanner.nextInt();
        cups+=plusCups;
    }
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        while(true){
            coffeeMachine.start();
        }

    }
}
