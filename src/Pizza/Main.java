package Pizza;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int menu;
        System.out.println("\n\nGood morning!");
        System.out.println("Would you like to buy a pizza?\n1. Yes\n2. No");
        do{
            menu = num.nextInt();
        } while (menu>2||menu<1);
        if (menu == 2)
            System.out.println("Then what the hell are you doing here? Go away!");
        else
            buyingPizza();
    }
    private static void buyingPizza(){
        int menu;
        Scanner num = new Scanner(System.in);
        System.out.println("Which cake would you like for your pizza?\n1. Thin\n2. Fluffy");
        do{
            menu = num.nextInt();
        } while (menu>2||menu<1);
        String pizzaType;
        if (menu == 2){
            pizzaType = "Fluffy";
        }
        else{
            pizzaType = "Thin";
        }
        int type = menu-1;
        CreatePizza[] create = {new ThinPizza(), new FluffPizza()};
        String[] toppingsArray = new String[6];
        System.out.println("\nOkay, here is the list of toppings, you can choose up to six. Choose \"none\" or all six to move on (every toppings costs 2$):");
        create[type].createPizza();
        double price = create[type].getPrice();
        List<String> toppingsList = create[type].getToppings();
        for (int i = 0; i<toppingsList.size(); i++){
            System.out.println("\t" + (i+1) + ". " + toppingsList.get(i));
        }
        for(int i = 0; i<toppingsArray.length; i++){
            do{
                menu = num.nextInt();
            } while (menu>toppingsList.size()||menu<1);
            if (toppingsList.get(menu-1).equals("none"))
                break;
            price += 2;
            toppingsArray[i] = toppingsList.get(menu-1);
        }
        System.out.println("\nAnd, here is the list of sauces. Choose \"none\" if you wont any (every sauce costs 1$):");
        List<String> saucesList = create[type].getSauces();
        String sauce;
        for (int i = 0; i<saucesList.size(); i++){
            System.out.println("\t" + (i+1) + ". " + saucesList.get(i));
        }
        do{
                menu = num.nextInt();
            } while (menu>saucesList.size()||menu<1);
            if (saucesList.get(menu-1).equals("none")) {
                sauce = "no";
            }
            else{
                sauce = saucesList.get(menu-1);
                price += 1;
            }
            System.out.print("\n\nSo you bought a pizza with\n\t- a " + pizzaType + " cake and with\n\t- ");
            int number = 0;
            while (toppingsArray[number] != null){
                System.out.print(toppingsArray[number] + " ");
                number++;
                if (number == 6)
                    break;
            }
            if (number == 0)
                System.out.print("no ");
            System.out.print("toppings\n\t- " + sauce + " sauce");
            System.out.printf("\nIt will cost you %.2f$\nHave a nice day!", price);
    }
}
