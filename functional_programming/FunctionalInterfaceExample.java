package functional_programming;

public class FunctionalInterfaceExample{
    
    public static void main(String[] args) {
        // Using a lambda expression to implement the abstract method of the functional interface
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Implementation of the abstract method");

        // Calling the abstract method using the functional interface instance
        myFunctionalInterface.myAbstractMethod();

        // Calling the default method
        myFunctionalInterface.myDefaultMethod();
    }

    
}
