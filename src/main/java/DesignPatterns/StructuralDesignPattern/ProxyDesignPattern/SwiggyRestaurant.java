package DesignPatterns.StructuralDesignPattern.ProxyDesignPattern;

public class SwiggyRestaurant implements SwiggyOrder{

    @Override
    public void placeOrder(int quantity, double price ,String restaurant) {
        System.out.println("Swiggy Restaurant : \n \tOrderd Restaurant Name :"+ restaurant +" \n\t\tOrder Quantity :"+ quantity+ " and Price is :"+ price);
    }
}