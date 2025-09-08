package OOPS6.ExceptionHandling;

public class Main {
    public static void main(String[] args) { // Exception is thrown using throwable class and there r 2 types of exception checked(Compiletime exception) and unchecked(Runtime Exception (divide by 0)) exception

        int a=5;
        int b=0;
        try{
//            System.out.println(a/b);
//            divide(a,b);
            throw new Exception("It is just for fun");// this one is normal exception

        } catch (ArithmeticException e){ // more strict exceptions should be here
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Normal Exception caught");
        } finally {
            System.out.println("It will always run");
        }

    }

    static int divide(int a, int b) throws ArithmeticException{// throws keyword id used to tell it may throw an exception
        if(b==0){
            throw new ArithmeticException("Donot Divide By Zero");// when you explicitly wants to throw a message then you can do this
        }
        return a/b;
    }
}
