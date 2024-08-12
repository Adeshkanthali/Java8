package Github.Java8.MethodReferences;

public class MethodRefToStaticMethod {
    public static void main(String[] args) {

        MyInterface5 myInterface5 = MethodRefToStaticMethod::display;

        myInterface5.show();
    }

    public static void display(){
        System.out.println("in display");
    }

}

interface MyInterface5{
    void show();
}

