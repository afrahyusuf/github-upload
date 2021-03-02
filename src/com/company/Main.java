package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StoreItem store= new StoreItem("hello",10,"new",24.0,5,5);

        System.out.println(store.toString());
        System.out.println("Total price:" +store.totalPrice());


    }

}
