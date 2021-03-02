package com.company;

public abstract class item {
    private String itemName;
    private int itemNum;
    private String make;
    private double price;

    public  item(){
    }

    public item(String itemName,int itemNum, String make, double price){
        this.itemName = itemName;
        this.itemNum= itemNum;
        this.make=make;
        this.price=price;
    }
    public String getItemName(){
        return itemName;
    }
    public int getItemNum(){
        return  itemNum;
    }
    public String getMake(){
        return make;
    }
    public double getPrice(){
        return price;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "itemName=" + itemName +
                ", itemNum=" + itemNum +
                ", make=" + make +
                ", price=" + price;
    }

    public abstract double totalPrice();

}
