
class Dog {
    String string;
    Dog() {
         string = "Dog ";
    }
    public String toString() {
        return string;
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Exercise2 {
    private Object[] items;
    private int next = 0;
    public Exercise2(int size) { items = new Object[size];}
    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector() {
       return new SequenceSelector();
    }
    public static void main(String[] args){
    Exercise2 sequence = new Exercise2(5);
       for (int i = 0; i < 5; i++) 
           sequence.add(new Dog());
        Selector selector = sequence.selector();
        while(!selector.end()) {
             System.out.print(selector.current() + " ");
             selector.next();
        }
    }
}
