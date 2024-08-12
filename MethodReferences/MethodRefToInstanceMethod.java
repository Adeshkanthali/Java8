package Github.Java8.MethodReferences;

public class MethodRefToInstanceMethod {

    public void display(){
        System.out.println("in display");
    }

    public static void main(String[] args) {
        MethodRefToInstanceMethod obj = new MethodRefToInstanceMethod();

        //refer
        MyInterface4 myInterface4 = obj::display;
        
        //calling
        myInterface4.show();
    }

}

interface MyInterface4 {
    void show();
}
