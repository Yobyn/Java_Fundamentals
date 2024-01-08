public class Outer {

  private String greeting = "Hi";

  final protected class Inner {
    public int repeat = 3;
    public void go() {
      for (int i =0; i < repeat; i ++){
        System.out.println(greeting); // Inner class can access methods of the outer class
      }
    }
  }

  public static void main(String[] args){
    Outer outer = new Outer();
    Inner inner = outer.new Inner();
    inner.go();
  }

}
