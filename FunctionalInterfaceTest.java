@FunctionalInterface
interface Test {
    public void m1();
}

 public class FunctionalInterfaceTest implements Test{
      @Override
     public void m1() {
          System.out.println("Hello world..!");
 }

 public static void main(String[] args) {
               FunctionalInterfaceTest fn =  new FunctionalInterfaceTest();
                          fn.m1();
}}

