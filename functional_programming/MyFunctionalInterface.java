package functional_programming;

@FunctionalInterface
public interface MyFunctionalInterface {
    void myAbstractMethod();

    // This is a default method, and it does not count towards the single abstract method requirement
    default void myDefaultMethod(){
        System.out.println("MyFunctionalInterface default method");
    }
}
