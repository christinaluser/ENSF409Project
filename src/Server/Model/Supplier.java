package Server.Model;

import java.util.ArrayList;

public class Supplier {

    private int supId;
    private String supName;
    private String supAddress;
    private String supContactName;
    private ArrayList<Item> itemList;

    public Supplier(int id, String name, String address, String contactName) {
        supId = id;
        supName = name;
        supAddress = address;
        supContactName = contactName;
        itemList = new ArrayList<Item>();
    }

    /**
     * getter for the supplier id
     *
     * @return supId
     */
    public int getSupId() {
        return supId;
    }

    /**
     * @param supId ID of supplier to set
     */
    public void setSupId(int supId) {
        this.supId = supId;
    }

    /**
     * getter for the supplier name
     *
     * @return supName
     */
    public String getSupName() {
        return supName;
    }

    /**
     * @param supName name of sup to set
     */
    public void setSupName(String supName) {
        this.supName = supName;
    }

    /**
     * getter for the supplier address
     *
     * @return supplier address
     */
    public String getSupAddress() {
        return supAddress;
    }

    /**
     * @param supAddress sup address to set
     */
    public void setSupAddress(String supAddress) {
        this.supAddress = supAddress;
    }

    /**
     * getter for the supplier contact name
     *
     * @return supplier's contact name
     */
    public String getSupContactName() {
        return supContactName;
    }

    /**
     * @param supContactName contact name of sup to set
     */
    public void setSupContactName(String supContactName) {
        this.supContactName = supContactName;
    }

    /**
     * @return the attributes of supplier stringed
     */
    public String toString() {
        return supName + " Supplier ID: " + supId + "\n";
    }

    /**
     * getter for the item list
     *
     * @return gets item list
     */
    public ArrayList<Item> getItemList() {
        return itemList;
    }

    /**
     * @param itemList item list to set
     */
    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
}

