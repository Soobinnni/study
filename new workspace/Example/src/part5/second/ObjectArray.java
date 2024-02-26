package part5.second;

import java.util.Arrays;

public class ObjectArray {
    private final static int DEFULAT_CAPACITY=5;
    private Object[] elements;
    private int size=0;

    public ObjectArray(){
//        this.elements = new Object[DEFULAT_CAPACITY];
        this(DEFULAT_CAPACITY);
    }
    public ObjectArray(int capacity){
        this.elements = new Object[capacity];
    } // 원하는 크기의 배열 생성.

    public void add(Object element){
        if(size == elements.length){
            enhanceCapcity();
        }
        elements[size++] = element;
    }

    public Object get(int index){
        if(index < 0 || index >= elements.length){
            throw new IndexOutOfBoundsException("범위 초과");
        }
        return elements[index];
    }

    public int getSize(){
        return this.size;
    }
    private void enhanceCapcity(){
        int newCapacity = size + 1;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    @Override
    public String toString() {
        return "ObjectArray{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }
}
