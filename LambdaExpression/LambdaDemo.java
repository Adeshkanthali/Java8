package Github.Java8.LambdaExpression;

public class LambdaDemo {

    public static void main(String[] args) {

        // Lambda expression
        MyInterface myInterface = (int x) -> x * 2;

        // Using Lambda expression call method
        int result = myInterface.Number(5);

        System.out.println(result);

    }
}
