package Server.Model;

/**
 * This implements the OrderLine
 * @author Christina Lu, Layla Arab, MD Rashik Hassan
 * @version 1.0
 * @since April 5 2019
 */
public class OrderLine {
    /**
     * the item in the order
     */
    private Item theItem;
    /**
     * number of items to order
     */
    private int orderQuantity;

    /**
     * constructs an orderline object
     * @param item
     * @param quantity
     */
    public OrderLine (Item item, int quantity) {
        theItem = item;
        setOrderQuantity(quantity);
    }

    /**
     *
     * @return the item to order
     */
    public Item getTheItem() {
        return theItem;
    }

    /**
     *
     * @param theItem the item to set
     */
    public void setTheItem(Item theItem) {
        this.theItem = theItem;
    }

    /**
     *
     * @return number of items ordered
     */
    public int getOrderQuantity() {
        return orderQuantity;
    }

    /**
     *
     * @param orderQuantity the quantity of the items to set
     */
    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    /**
     *
     * @return String of the attributes in the orderline
     */
    public String toString (){
        return  "Item Name: " + theItem.getItemName() +
                ", Item ID: " + theItem.getItemId()+ "\n" +
                "Order Quantity: " + orderQuantity + "\n";
    }

}
