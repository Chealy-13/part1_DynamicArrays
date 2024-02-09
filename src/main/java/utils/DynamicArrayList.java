package utils;

public class DynamicArrayList {
    private String[] data;
    private int numOfElements;

    //A default constructor that takes no parameters and initialises the internal array to the standard initial
    //capacity.
    public DynamicArrayList() {
        data = new String[10];
    }

    //A method called size() that takes no parameters & returns the number of elements currently stored in your list
    public int size() {
        return numOfElements;
    }

    //A method called get() that takes a single parameter, an int representing the position from which data should
    //be retrieved. The position should be validated and invalid positions handled accordingly.
    //If the position is valid, the method should return the data (a String) in the position specified.
    public String get(int pos) {
        if (pos < 0 || pos >= numOfElements) {
            throw new IndexOutOfBoundsException("Invalid position supplied");
        }
        return data[pos];
    }

    //A method called indexOf() that takes one parameter, a String to be found in the list. The method should
    //return an int indicating the position at which the String could be found. If the String could not be found, an
    //appropriate value should be returned to indicate this.
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

    //      AN EXTRA CONSTRUCTOR
//Your dynamic array list should include a constructor that lets the user specify by how much the list
// should expand each time it runs out of space in its internal array. The constructor should take in
// one parameter, an int that specifies the expansion factor to be used.
// The supplied value should be validated, and invalid values handled accordingly.
    public DynamicArrayList(int size) {
        data = new String[size];
    }

//      AN EXTRA ADD
//    Your list should contain a method called add() that takes two parameters:
//    A String to be added (this may be null).
//    A position at which to insert the data.

//    The position should be validated and invalid positions handling accordingly. If the position is valid,
//    the data from that position should be added to the list using shift insertion.
//    If there is insufficient space in the list, the internal array should be
//    grown (using the arraycopy method from Java’s API OR your own growArray algorithm) and
//    the String added then. If supplied, null values should be added.
//    The method should return nothing.


//      A REMOVE
//Your list should contain a method called remove() that takes two parameters:
//    The String to be removed (This should not be null).
//    An int indicating the position from which to start the removal process.
//    The first instance of this String found starting at the specified position should be
//    removed from the list. The method should return a boolean indicating if an instance
//    of the String was removed.


//    A RANDOM OTHER FEATURE
//Your list should contain a method called clear() that takes no parameters and returns nothing.
// This method should wipe the content of the array and reset it back to the initial size.


}
