package DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public class SwiggyInstamart implements SwiggyOrder{

    @Override
    public void placeOrder(int quantity, double price ,String store) {
        System.out.println("Swiggy Instamart : \n \tOrderd Store Name :"+ store
                +"\n\t\t Order Quantity :"+ quantity+ " and Price is :"+ price);
    }
}