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



}
