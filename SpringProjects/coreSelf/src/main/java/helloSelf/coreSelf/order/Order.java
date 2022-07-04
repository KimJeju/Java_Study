package helloSelf.coreSelf.order;

public class Order {
    private Long itemId;
    private String itemName;
    private int price;

    public Order(Long itemId, String itemName, int price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }


    public Long getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }
}
