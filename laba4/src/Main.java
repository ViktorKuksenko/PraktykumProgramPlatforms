import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
//        Item[] items = {
//                new Item("Cannon db 340", "digital camera",
//                "Digital camera with high resolution", 400, true, 34,
//                "2019-02-15"),
//                new Item("Apple Iphone X", "phone",
//                "Mobile phone", 1015, false, 0,
//                "2019-02-05"),
//                new Item("Apple MacBook", "laptop",
//                "Powerful PC", 1500, true, 23,
//                "2019-05-05"),
//                new Item("Apple Iphone XR", "phone",
//                "Mobile phone", 1100, true, 78,
//                "2020-02-05")};
        ArrayList <Item> it = new ArrayList<>();
        it.add(new Item("Cannon db 340", "camera",
                "Digital camera with high resolution", 400, true, 34,
                "2019-02-15"));
        it.add(new Item("Apple Iphone X", "phone",
                "Mobile phone", 1015, false, 0,
                "2019-02-05"));
        it.add(new Item("Apple MacBook", "laptop",
                "Powerful PC", 1500, true, 23,
                "2019-05-05"));
        it.add( new Item("Apple Iphone XR", "phone",
                "Mobile phone", 1100, true, 78,
                "2020-02-05"));

        Shop shop = new Shop(it);
        //shop.printItems();
       // System.out.println(items[0].getDate());
        System.out.println("___________________________________________________________________________________");
        System.out.println("___________________All available items on the storage______________________________");
        shop.printAllAvaliableItems();
        System.out.println("___________________________________________________________________________________");
        System.out.println("___________________All not available items on the storage__________________________");
        shop.printNotAvailableItems();
        System.out.println("___________________________________________________________________________________");
        System.out.println("___________________Enter Category of Item to Search________________________________");
        String itemToSearch = scanner.next();
        shop.searchByCategory(itemToSearch);
    }
}
