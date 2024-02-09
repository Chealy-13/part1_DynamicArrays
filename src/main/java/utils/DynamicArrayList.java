package utils;

public class DynamicArrayList {
    private String[] data;
    private int numOfElements;

    //A default constructor that takes no parameters and initialises the internal array to the standard initial
    //capacity.
    /**
     * Constructs a new DynamicArrayList with a default initial capacity of 10.
     * The DynamicArrayList dynamically resizes its internal array as needed
     * to accommodate more elements.
     */
    public DynamicArrayList() {
        data = new String[10];
    }

    //A method called size() that takes no parameters & returns the number of elements currently stored in your list
    /**
     * Returns the number of elements currently stored in the DynamicArrayList.
     * This method provides the current size of the list, indicating the number
     * of elements that have been added to it.
     * @return The number of elements currently stored in the list.
     */
    public int size() {
        return numOfElements;
    }

    //A method called get() that takes a single parameter, an int representing the position from which data should
    //be retrieved. The position should be validated and invalid positions handled accordingly.
    //If the position is valid, the method should return the data (a String) in the position specified.
    /**
     * Retrieves the element at the specified position in the DynamicArrayList.
     * This method returns the element located at the given position within the list.
     * The position index should be within the valid range of indices (0 to size() - 1).
     * If the specified position is out of bounds, an IndexOutOfBoundsException is thrown.
     *
     * @param pos the position index of the element to retrieve.
     * @return the element at the specified position.
     * @throws IndexOutOfBoundsException if the specified position is out of bounds.
     *
     */
    public String get(int pos) {
        if (pos < 0 || pos >= numOfElements) {
            throw new IndexOutOfBoundsException("Invalid position supplied");
        }
        return data[pos];
    }

    //A method called indexOf() that takes one parameter, a String to be found in the list. The method should
    //return an int indicating the position at which the String could be found. If the String could not be found, an
    //appropriate value should be returned to indicate this.
    /**
     * Returns the index of the specified element in the DynamicArrayList,
     * or -1 if the element is not found.
     * @param stringToFind the element to search for in the list.
     * @return the index of the first occurrence of the specified element,
     *         or -1 if the element is not found.
     */
    public int indexOf(String stringToFind) {
        for (int i = 0; i < data.length; i++) {
            if (stringToFind == data[i]) {
                return i;
            }
        }
        return -1;
    }

    //A method called add() that takes a single parameter, a String to be added. This String should be added to the
//end of the list. If there is insufficient space in the list, the internal array should be grown, and the String added
//then. Null values should be allowed. The method should return a boolean indicating if the String was added.
    /**
     * Puts the specified element to the end of the DynamicArrayList.
     * This method adds the specified element to the end of the list. If the internal
     * array is full, it dynamically resizes the array by doubling its capacity.
     * The method returns true after successfully adding the element.
     * @param stringToBeAdded the element to be added to the list.
     * @return true after successfully adding the element.
     */
    public boolean add(String stringToBeAdded) {
        if (numOfElements == data.length) {
            // If the array is full, double its capacity
            String[] newData = new String[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[numOfElements] = stringToBeAdded;
        numOfElements++;
        return true;
    }


}
