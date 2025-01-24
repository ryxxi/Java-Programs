package MyArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTests {

    MyArrayList test;

    @BeforeEach
    public void createObjectOfClass(){
        test = new MyArrayList();
    }

    @Test
    public void testNewArrayIsEmpty(){
        assertTrue(test.isEmpty());
    }
    
    @Test
    public void testCanAddElement(){
        test.add(12);
        assertFalse(test.isEmpty());
        assertEqual(12, test.get(0));
    }

    @Test
    public void testCanRemoveElement(){
        test.add(12);
        assertFalse(test.isEmpty());

        test.remove(12);
        assertTrue(test.isEmpty());
    }

    @Test
    public void testCanClearList(){
        test.add("hello");
        test.add(12);
        test.add(true);
        assertFalse(test.isEmpty());
        assertEqual(3, test.size());

        test.clear();
        assertTrue(test.isEmpty());
    }

    @Test 
    public void testCanAddAtCapacity(){
        for(int i = 0; i < 5; i++) test.add(i);
        assertEqual(5, test.size());

        test.add(5);
        assertEqual(5, test.get(5));
        assertEqual(6, test.size());
    }

    @Test 
    public void testCanRemoveByElement(){
        for(int i = 0; i < 5; i++) test.add((String) i);
        assertEqual(5, test.size());

        remove((String) 4);
        assertEqual(4, test.size());
        assertThrows(IndexOutOfBoundsException, test.get(5));
    }
}
