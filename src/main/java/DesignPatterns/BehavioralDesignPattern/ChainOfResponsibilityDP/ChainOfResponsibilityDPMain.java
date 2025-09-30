package DesignPatterns.BehavioralDesignPattern.ChainOfResponsibilityDP;

public class ChainOfResponsibilityDPMain {
    public static void main(String[] args) {

        PaymentHandler banking = new Banking();
        PaymentHandler creditC = new CreditCard();
        PaymentHandler paypal = new Paypal();
        banking.setNext(creditC);
        creditC.setNext(paypal);
        int i, j, k, l, m;
        i = 300;
        j = 1200;
        k = 900;
        l = 100;
        m = 1600;

        try {
            if (m > 1500 || m < 0)
                throw new NeelExeption("Given amount is not Suitable amount is : "+ m);

            banking.handlePayment(i);
            banking.handlePayment(j);

            banking.handlePayment(k);
            banking.handlePayment(l);

            banking.handlePayment(m);


        } catch (NeelExeption e) {
            System.out.println(e.getMessage());

        }
        catch (Exception e){
            System.out.println("Default Execption :" + e );
        }


    }


}

class NeelExeption extends NullPointerException {
    public NeelExeption(String s) throws NullPointerException {
//        System.out.println(s);
        super("NullPointerException :"+s);
    }
}