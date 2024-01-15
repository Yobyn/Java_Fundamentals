package interface_memebers;

public class MyClass implements MyInterface {

@Override
public void myAbstractMethod() {
    // TODO Auto-generated method stub
    
}
@Override
public void myDefaultMethod(){
    System.out.println("Class override of myDefaultMethod"); 
}


public void printtMyInterfaceDefaultMethod(){
    MyInterface.super.myDefaultMethod();
}


public static void main(String[] args) {
    
    //below code won't compilec can't call super in main method / or static context 
    //MyInterface.super.myDefaultMethod();

    new MyClass().myDefaultMethod();
    new MyClass().printtMyInterfaceDefaultMethod();
}

}
