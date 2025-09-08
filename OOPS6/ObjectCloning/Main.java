package OOPS6.ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human prince = new Human(23,"Prince");
//        Human twin= new Human(prince); Instead of doing this make a clone

        Human twin= (Human) prince.clone();
        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        System.out.println(Arrays.toString(prince.arr)); // I have changed 0th index to 100 and it is visible in both kunal and twin so in Ob ject Cloning  shallow copy is used.
        System.out.println(Arrays.toString(twin.arr));

    }
}
