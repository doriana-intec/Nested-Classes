package be.intecbrussel.iterator_demo;

import java.util.Iterator;

public class Datastructure {

    interface DataStructureIterator extends Iterator<Integer>{}

    public static  final int SIZE =15;
    private int [] arrayOfInts = new int[SIZE];

    public Datastructure() {
        populateArray();
    }

    private void populateArray(){
        for (int i = 0;i < SIZE; i++){
            arrayOfInts[i] = i;
        }
    }

    public void printEvenNumbers(){
        DataStructureIterator iterator = new EvenIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
    class  EvenIterator implements DataStructureIterator{

        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return (nextIndex <= SIZE -1);
        }

        @Override
        public Integer next() {
            Integer value = arrayOfInts[nextIndex];
            nextIndex += 2;
            return value;
        }
    }
}
