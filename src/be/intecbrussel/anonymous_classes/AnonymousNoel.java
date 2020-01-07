package be.intecbrussel.anonymous_classes;

public class AnonymousNoel {

    abstract class SuperClass {
        public abstract void methodSuperClass();
    }

    interface SuperInterface {

        void methodInterface();
    }

    public void method() {
        SuperInterface superInterface = new SuperInterface() {
            @Override
            public void methodInterface() {
                System.out.println("interface method");
            }
        };
        superInterface.methodInterface();

        SuperClass superClass = new SuperClass() {
            @Override
            public void methodSuperClass() {
                System.out.println("superclass method");
            }
        };
        superClass.methodSuperClass();
    }
}
