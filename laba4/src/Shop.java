import java.util.ArrayList;

public class Shop {
    ArrayList <Item> items;

    Shop(ArrayList <Item> item) {
        items = item;
    }

    public void printItems() {
        for(Item it: items) {
            System.out.println(it);
        }
    }
    public void printAllAvaliableItems() {
        for(Item it: items) {
            if (it.isAvaliable() == true ) {
                System.out.println(it);
            }
        }
    }
    public void printNotAvailableItems() {
        for(Item it: items) {
            if (it.isAvaliable() == false ) {
                System.out.println(it);
            }
        }
    }
    public void searchByCategory(String Category) {
        for (Item it : items) {
            if (it.getCategory().contains(Category)) {
                System.out.println(it);
            }
        }
    }
}