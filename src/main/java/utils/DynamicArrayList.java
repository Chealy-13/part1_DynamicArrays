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


}
