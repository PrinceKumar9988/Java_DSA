package OOPS5.Nested_Interfaces;

public class A {

    public interface NestedInterface{

        boolean isodd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isodd(int num) {
//        if((num&1)==1){
//            return true;
//        }
//
//        return false;

        return (num&1)==1;
    }
}
