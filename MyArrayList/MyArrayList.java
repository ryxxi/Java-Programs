package MyArrayList;

public class MyArrayList {
    
    private Object[] elements = new Object[5];
    private int size = 0;
    private int capacity = 5;

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(Object element){
        if(isFull()) increaseCapacity();
        elements[size++] = element;
    }

    public void resetSize(){
        size = 0;
    }

    private boolean isFull(){
        return size == capacity;
    }

    private void increaseCapacity(){
        capacity *= 2;
    }

    public void remove(Object element){
        int elementIndex = getIndexOf(element);
        if(elementIndex > -1){
            updateArray(elementIndex);
            size--;
        }
    }

    public void remove(int index){
        updateArray(index);
        size--;
    }

    private void updateArray(int elementIndex){
        for(int i = elementIndex; i < size; i++){
            if(i == size - 1) elements[i] = null;
            else elements[i] = elements[i+1];
        }
    }
        
    private int getIndexOf(Object element){
        for(int i = 0; i < size; i++){
            if(elements[i] == element) return i;
        }
        return -1;
    }

    public Object get(int index){
        if(elements[index] == null) throw IndexOutOfBoundsException;
        return elements[index];
    } 

    public boolean contains(Object search){
        for(Object element : elements){
            if(element.equals(search) | element == search) return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void clear(){
        Object[] newElements = new Objects[size];
        elements = newElements;
        size = 0;
    }

    public void set(int index, Object element){
        try {
            elements[index] = element;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        }
    }
}
