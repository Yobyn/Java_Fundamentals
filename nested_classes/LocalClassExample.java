package nested_classes;
public class LocalClassExample {

  private int length = 5;

  public void calculate(){
     final int width = 20;
     class InnerLocalClass {
          public void multiply() {
            System.out.println(length * width);
          }

     }

     InnerLocalClass localClass = new InnerLocalClass();
     localClass.multiply();
  }

  public static void main(String[] args) {
    LocalClassExample localClass = new LocalClassExample();
    localClass.calculate();



    //Anonymous Class - below code creates a intance of a Class from a Intrface (by implementing the Interface)
    System.out.println( new InnerLocalClassExample(){ public String exampleTestPrint() {return "Hello Anonymous Class";}; }.exampleTestPrint());
  }

  /**
   * Anonymous Class Interface can do it with Abstract class aswell intsead of the Anonymous Class implementing the interface it is extending the abstrac class 
   */
  public interface InnerLocalClassExample {

    String exampleTestPrint();
  
  }

}
