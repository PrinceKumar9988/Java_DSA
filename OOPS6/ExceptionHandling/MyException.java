package OOPS6.ExceptionHandling;

public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }

    public static void main(String[] args) {

        try{
            String name="Prince";
            if(name.equals("Prince")) {
                throw new MyException("This is my personal exception Prince");
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("It always executes");
        }

    }
}
