package be.intecbrussel.inner_classes;

public class OuterClass {

    class Inner{
        public void doSomething(){
            System.out.println("calling method from inner class");
        }
    }

    public void outerMethod(){
        Inner inner = new Inner();
        inner.doSomething();
    }
}
