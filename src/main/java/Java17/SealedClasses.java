package Java17;

sealed class SealedClasses permits Car,Jeep,Bike{
    void ride(){
        System.out.println("Inside Sealed Class ride");
    }

}

final class Bike extends SealedClasses {

}

non-sealed class Car extends SealedClasses{
    public static void main(String[] args) {
        var se = new SealedClasses();
        se.ride();

    }

}