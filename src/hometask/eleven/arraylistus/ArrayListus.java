package hometask.eleven.arraylistus;

import java.util.Iterator;

/**
 * Created by Kocherga Vitalii on 16.02.2016.
 */

public class ArrayListus<T> implements Iterable {

    private final int STANDARD_CAPACITY = 15;
    private int size = 0;
    private int listusCapacity;
    private T[] objContainer;

    /**
     * Standard constructor
     */
    public ArrayListus() {
        objContainer = (T[]) new Object[STANDARD_CAPACITY];
        listusCapacity = STANDARD_CAPACITY;
    }

    /**
     * Constructor with user defined capacity
     *
     * @param customCapacity
     */
    public ArrayListus(int customCapacity) {
        objContainer = (T[]) new Object[customCapacity];
        listusCapacity = customCapacity;
    }

    /**
     * Adding elements to array in natural order
     * @param value
     */
    public void add(T value) {
        objContainer[size] = value;
        size++;
        capacityChecker();
    }

    /**
     * Adding elements to array on specified position in array
     * @param index - position for the element
     * @param value - value of element
     */
    public void add(int index, T value) {
        try {
            T[] tempArr = (T[]) new Object[listusCapacity + 1];
            if (index > 0 && index < size) {
                System.arraycopy(objContainer, 0, tempArr, 0, index);
                System.arraycopy(objContainer, index, tempArr, index + 1, objContainer.length - index - 1);
                tempArr[index] = value;
                objContainer = tempArr;
                size++;
                capacityChecker();
            } else if (index == 0) {
                addFirst(value);
            } else if (index >= size) {
                throw new IndexOutOfBoundsException("Out of bound");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.print("Out of bound");
        }
    }

    /**
     * Setting the value of element on specified position in array
     * @param index - position of element
     * @param value
     */
    public void set(int index, T value) {
        if (index >= 0 && index < size) {
            objContainer[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Out of bound");
        }
    }

    /**
     * Removing element on specified position from array
     * @param index - position of element
     */

    public void remove(int index) {

        T[] tempArr = (T[]) new Object[listusCapacity];
        if (index >= 0 && index < size) {
            objContainer[index] = null;
            System.arraycopy(objContainer, 0, tempArr, 0, index);
            System.arraycopy(objContainer, index + 1, tempArr, index, objContainer.length - index - 1);
            objContainer = tempArr;
            capacityChecker();
            size--;
        } else if (index == size - 1) {
            objContainer[index] = null;
        } else {
            throw new IndexOutOfBoundsException("Out of bound");
        }

    }

    /**
     *
     * Getting the value of element on specified position in array
     * @param index - element position
     * @return value of element
     */
    public T getValue(int index) {
        if (index >= 0 && index < listusCapacity) {
            return objContainer[index];
        } else {
            throw new IndexOutOfBoundsException("Out of bound");
        }
    }

    /**
     * Setting the element of specified value as a first element of array
     * @param value
     */
    private void addFirst(T value) {
        T[] tempArr = (T[]) new Object[listusCapacity + 1];
        System.arraycopy(objContainer, 0, tempArr, 1, listusCapacity);
        tempArr[0] = value;
        objContainer = tempArr;
        size++;
        capacityChecker();
    }

    /**
     * Method is checking if the size of array is close to it's capacity
     * and increasing it
     */
    private void capacityChecker() {
        if (size >= listusCapacity - 1) {
            T[] tempArr = (T[]) new Object[listusCapacity + listusCapacity / 2];
            System.arraycopy(objContainer, 0, tempArr, 0, size);
            objContainer = tempArr;
            listusCapacity = objContainer.length;
        } else {
            listusCapacity = objContainer.length;
        }
    }

    /**
     *
     * @return the size of list
     */

    public int size() {
        return size;
    }

    /**
     *
     * @return capacity of list
     */
    public int capacity() {
        return listusCapacity;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < listusCapacity;
            }

            @Override
            public Object next() {
                return objContainer[index++];
            }
        };
    }
}
