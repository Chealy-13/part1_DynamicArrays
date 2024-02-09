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




}
