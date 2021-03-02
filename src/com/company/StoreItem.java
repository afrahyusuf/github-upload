package com.company;


public class StoreItem extends item
{
    private int quantity;
    private double discountPrice;

    public StoreItem(){
        super("",0,"",0.0);
    }
    public StoreItem(String itemName,int itemNum, String make, double price, int quantity, double discountPrice){
        super(itemName,itemNum,make,price);
        this.quantity=quantity;
        this.discountPrice=discountPrice;
    }
    public void setItemName(String itemName) { super.setItemName(itemName);}
    public void setItemNum(int itemNum) { super.setItemNum(itemNum);}
    public void setMake(String make) { super.setMake(make); }
    public void setPrice(double price) { super.setPrice(price); }
    public void setDiscountPrice(double discountPrice) { this.discountPrice = discountPrice; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getItemName() { return super.getItemName();}
    public double getPrice() { return super.getPrice(); }
    public int getItemNum() { return super.getItemNum();}
    public String getMake() { return super.getMake(); }
    public double getDiscountPrice() { return discountPrice; }
    public int getQuantity() { return quantity; }

    public double totalPrice() {
        return ((getPrice()* (1.0 - discountPrice/100))*quantity);
    }

    @Override
    public String toString() {
        return super.toString() + "quantity=" + quantity + ", discountPrice=" + discountPrice + '}';

    }


}
