package app;

import utils.DynamicArrayList;

import java.util.Scanner;

/**
 * @author michelle
 */
public class ShoppingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1. Creates an instance of your DynamicArrayList class.
        DynamicArrayList myList = new DynamicArrayList();
//        2. Asks the user how many entries they’d like to add to their shopping list.
        System.out.println("How many items would you like to add to your shopping list?");
        int numItems = sc.nextInt();
        sc.nextLine();
//        3. Prompts the user to enter the specified number of entries for their shopping list and
//        adds each to the list (each line can contain one or more words each, or may be null)
        System.out.println("Please type your " + numItems + " items below");
        for (int i = 0; i < numItems; i++) {
            String item = sc.nextLine();
            myList.add(item);
        }
//        4. Loops through the shopping list and displays the content.
        System.out.println("My Shopping List:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println((i + 1) + ". " + myList.get(i));
        }

//        5. Repeatedly offers a menu of actions that can be done by the shopping list (based on the functionality you have
//        been tasked with) and provides the logic for each.
        boolean quit = false;
        while (!quit) {
            System.out.println("\nMenu");
            System.out.println("1. Add an item to your list");
            System.out.println("2. Quit");
            System.out.println("Choose an option");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter the item to add: ");
                    String newItem = sc.nextLine();
                    myList.add(newItem);
                    System.out.println("My Shopping List:");
                    for (int i = 0; i < myList.size(); i++) {
                        System.out.println((i + 1) + ". " + myList.get(i));
                    }
                    break;

                case 2:
                    quit = true;
                    break;

                default:
                    System.out.println("Invalid choice please try again");
            }
        }
        sc.close();
    }
}
