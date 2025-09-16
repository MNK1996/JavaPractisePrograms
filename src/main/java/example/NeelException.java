package example;

class NeelException extends ArithmeticException {
    public NeelException(String s){
        super(s);
    }
}

class NeelExceptionIntI extends NeelException{
    public NeelExceptionIntI(String s) throws NeelException{
        super(s);
    }
}