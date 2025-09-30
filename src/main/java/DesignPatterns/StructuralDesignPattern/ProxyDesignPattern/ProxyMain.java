package DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public class ProxyMain {
    public static void main(String[] args) {

        SwiggyOrder resOrder= new SwiggyRestaurant();
        SwiggyOrder storeOrder= new SwiggyInstamart();
        resOrder.placeOrder(3,57,"Mehfil");
        storeOrder.placeOrder(10,61456,"Vishal");

    }
}