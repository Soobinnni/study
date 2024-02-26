package part5.second;

import java.util.Arrays;

public class IntArray {
    private final static int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;

    public IntArray(){
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public int[] getArr(){
        return this.elements;
    }
    
    public int get(int index){
        if(index < 0 || index >= this.elements.length){
            throw new IndexOutOfBoundsException("범위 초과");
        }
        return elements[index];
    }

    public void add(int element) {
        if(this.size == this.elements.length){
            ensureCapacity();
        }
        this.elements[this.size++] = element;
    }

    private void ensureCapacity(){
        int newCapacity = this.size+1;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public String toString() {
        return "elements=" + Arrays.toString(elements) +
                ", length=" + this.elements.length;
    }
}
