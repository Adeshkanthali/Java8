package Github.Java8.MethodReferences;

public class MethodRefToConstructor{

    MethodRefToConstructor(){             //Constructor of MethodRefToConstructor Class
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        //refer
        MyInterface6 myInterface6 = MethodRefToConstructor :: new;

        //calling
        myInterface6.methodRefToConstructor();
    }

}

interface MyInterface6{

    MethodRefToConstructor methodRefToConstructor();

}
