package MySet;

import java.util.Random;

public class MySet {

    private MyArrayList myArrayList = new MyArrayList();
    private Random rand = new Random();

    public void addAll(Object[] items){
        Object[] shuffledElements = shuffleElements(items);

        for (Object element : shuffledElements){
            try {
                add(element);
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
    }

    private Object[] shuffleElements(Object[] items) {

        Object[] shuffledElements = new Object[items.length];
        int numberOfItems = items.length;

        while(numberOfItems > 0){
            int randomIndex = rand.nextInt(items.length);
            if(items[randomIndex] == null) continue;
            Object temp = items[randomIndex];
            items[randomIndex] = null;
            for(int i = items.length; i >= numberOfItems; i--) shuffledElements[items.length-i] = temp;
            numberOfItems--;
        }
        return shuffledElements;
    }

    public void add(Object element){
        if(!contains(element)) myArrayList.add(element);
    }

    public void increaseCapacity(){
        myArrayList.increaseCapacity();
    }

    public int size(){
        myArrayList.size();
    }

    public Object[] toArray(){
        Object[] array = new Object[size()];
        for (int i = 0; i < size(); i++){
            array[i] = myArrayList.get(i);
        }
        return array;
    }

    public boolean contains(Object search){
        return myArrayList.contains(search);
    }

    public void clear(){
        myArrayList.clear();
    }   

    public boolean containsAll(Object[] searches){
        int commonCounter = 0;
        for (Object search : searches){
            if(contains(search)) {
                commonCounter++;
                break;
            }
        }
        return commonCounter == searches.length;
    }

    public boolean isEmpty(){
        return myArrayList.isEmpty();
    }

    public void remove(Object removal){
        if(contains(removal)) myArrayList.remove(removal);
        else System.out.println("Element not found");
    }

    public void removeAll(Object[] removals){
        for (Object removal : removals) remove(removal);
    }

    public void retainAll(Object[] retainees){
        myArrayList.clear();

        if(containsAll(retainees)){
            for(int i = 0; i < retainees.length; i++) add(retainees[i]);
        }

        else{
            for(Object retainee : retainees){
                if(contains(retainee)) add(retainee);
            }
        }
    }

}
