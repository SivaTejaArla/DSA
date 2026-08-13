/*
 * Iterator in Java
 * ----------------
 * 1. Iterator is used to traverse elements of a Collection one by one.
 * 2. It belongs to java.util package.
 * 3. iterator() method returns an Iterator object.
 * 4. hasNext() checks whether another element exists.
 * 5. next() returns the next element and moves the cursor forward.
 * 6. remove() removes the current element safely during iteration.
 *
 * Example:
 *
 * int[] a = {1,2,3,4,5,6,7,8};
 *
 * List<Integer> list = Arrays.stream(a)
 *                            .boxed()
 *                            .toList();
 *
 * 
 * Iterator<Integer> it = list.iterator();
 *
 * Cursor Position:
 * [1,2,3,4,5,6,7,8]
 *  ^
 * Iterator starts before the first element.
 *
 * while(it.hasNext()) {
 * 
 *     System.out.println(it.next());
 * }
 *
 * Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 *
 * Note:
 * - next() returns the current element and advances the iterator.
 * - Calling next() when no elements are left throws
 *   NoSuchElementException.
 * - Iterator is useful when removing elements while traversing
 *   a collection.
 */

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        
        int []a = {1,2,3,4,5,6,7,8};

        List<Integer> z = Arrays.stream(a).boxed().toList();
        Iterator<Integer> i = z.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
                
            }
    }
}
