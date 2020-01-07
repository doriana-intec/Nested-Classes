package be.intecbrussel.inner_classes;

public class ShadowTest {

    private int x = 5;

    class FirstLevel{

        private int x = 8;

        public void methodFirstLevel(int x){
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }
}
