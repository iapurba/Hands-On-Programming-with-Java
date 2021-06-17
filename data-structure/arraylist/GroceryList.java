import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position - 1, newItem);
        System.out.println("Grocery item " + (position) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String removedItem = groceryList.get(position);
        groceryList.remove(position - 1);
        System.out.println(removedItem + "has been removed from grocery list");
    }

    public String findGroceryItem(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        return exists ? (searchItem + " is in position " + position) : (searchItem + " not exists in the list");
    }
}
