package ArrayListTasks;

import java.util.ArrayList;
import java.util.Collections;

public class Practice_1_ShoppingList {
    public static void main(String[] args) {
        //1
        ArrayList<String> shoppingList = new ArrayList<String>();

        shoppingList.add("Apples");
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Egg");
        shoppingList.add("Cheese");
        System.out.println("shoppingList = " + shoppingList);

        //2
     /*   int list = shoppingList.size();
        if (list!=0){
    System.out.println("Number of items on the list " +list);
}else {
            System.out.println("Empty List!");
        }
*/
        if (!shoppingList.isEmpty()) {
            System.out.println("Number of items on the list: " + shoppingList.size());
        } else {
            System.out.println("Empty List!");
        }

        //3
        System.out.println("Item at index 2: " + shoppingList.get(2));

        //4
        shoppingList.set(1, "Whole Wheat Bread");
        System.out.println("Modified shopping list: " + shoppingList);

        //5
        shoppingList.remove(3);
        System.out.println("Shopping list after removing item: " + shoppingList);

        //6
        System.out.println("Does the list contain Cheese?: " + shoppingList.contains("Cheese"));

        Collections.sort(shoppingList);
        System.out.println("Sorted shopping list: " + shoppingList);


       /* if(shoppingList.contains("Cheese")){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
*/
    }
}
