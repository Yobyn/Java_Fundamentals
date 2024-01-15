package interface_memebers;

public interface MyInterface {
    // Constant field implicitly public, static, and final (introduced in Java 1)
    int MY_CONSTANT = 42;

    // Abstract method - implicitly public and abstract (introduced in Java 1)
    void myAbstractMethod();

    // Default method (introduced in Java 8)
    // required modifiers: default
    default void myDefaultMethod() {
        System.out.println("Default implementation of myDefaultMethod");
    }

    // Static method (introduced in Java 8)
    // required modifiers: static
    static void myStaticMethod() {
        System.out.println("Static method myStaticMethod");
    }

    // Private method (introduced in Java 9)
    // required modifiers: private
    // Are useful when you have some common code that you want to share between default methods in the interface.
    private void privateMethod() {
        // common code
    }

    default void defaultMethodOne() {
        privateMethod();
        // specific code for this method
    }

    default void defaultMethodTwo() {
        privateMethod();
        // specific code for this method
    }


    // Private static method (introduced in Java 9)
    // required modifiers: private static
    // useful for housing repetitive code that can be shared across multiple static or default methods within the interface. 
    private static void privateStaticMethod() {
        // implementation code
    }

    static void staticMethodOne() {
        privateStaticMethod();
        // specific code for this static method
    }

    default void defaultMethod() {
        privateStaticMethod();
        // specific code for this default method
    }

}

