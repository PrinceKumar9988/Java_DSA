package OOPS2.OOPS2_5;

public class SingletonClass { // singletonClass are those class in which object can be created only once(only one refernce)

    private SingletonClass(){

    }

    static SingletonClass instance;

    public static SingletonClass getInstance(){
        // check if instance is null or not
        if (instance==null){
            instance=new SingletonClass();
        }
        return instance;
    }  // with the help of private and getInstance() methos we somehow have given reference from here to the main() method.
}
