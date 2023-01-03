package Behavioral_DesignPatterns.Iterator_DesignPattern;

public class NameRepository implements Container{
    public String[] names ={"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    private class NameIterator implements Iterator {

        int idx;

        @Override
        public boolean hasNext() {
            return idx < names.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? names[idx++] : null;
        }
    }

}
