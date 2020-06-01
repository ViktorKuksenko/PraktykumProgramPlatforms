import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Item {
    private String nameOfItem;
    private String category;
    private String description;
    private int priceForOne;
    private boolean isAvaliable;
    private int capacity;
    private String date;



    public Item(String nameOfItem, String category, String description, int priceForOne, boolean isAvaliable,
                int capacity, String date) {
        this.nameOfItem = nameOfItem;
        this.category = category;
        this.description = description;
        this.priceForOne = priceForOne;
        this.isAvaliable = isAvaliable;
        this.capacity = capacity;
        this.date = date;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriceForOne() {
        return priceForOne;
    }

    public void setPriceForOne(int priceForOne) {
        this.priceForOne = priceForOne;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        isAvaliable = avaliable;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public LocalDate getDate() throws ParseException {
        return LocalDate.parse(date);
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nameOfItem='" + nameOfItem + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", priceForOne=" + priceForOne +
                ", isAvaliable=" + isAvaliable +
                ", capacity=" + capacity +
                ", date=" + date +
                '}';
    }

}
