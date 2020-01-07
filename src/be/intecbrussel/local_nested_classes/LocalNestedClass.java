package be.intecbrussel.local_nested_classes;

public class LocalNestedClass {

    public void method(){
        final int CONST = 5;
        int x = 7;

        class LocalInner{

            public void printVariables(){
                System.out.println(CONST);
                System.out.println(x);
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.printVariables();
    }
}
