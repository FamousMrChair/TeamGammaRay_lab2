# TeamGammaRay_lab2

## ALTester.java
* sort(ArrayList<Integer> foo)
    * boolean method that tests if an ArrayList is sorted or not, true if sorted, false if unsorted
    * sorted means all elements are in ascending order
* extra arrange(ArrayList<Integer> foo)
    * sorts the ArrayList, using nested for loops
* main method 
    * tests sort method, but not arrange method

## OrderedArrayList.java
* Constructor OrderedArrayList() initializes ArrayList<Integer>
* size() returns the size (number of meaningful elements)
* toString() returns the ArrayList
* get(int index) returns the value of element at a given index
* remove(int index) removes the element at a given index
* add(int val) will add a value, maintaining order
    * uses a while loop to figure out where that value belongs in the list of ascending order

* main method has test calls: populates method, then adds elements out of order to test if the ArrayList order is maintained, then returns the ArrayList using toString()
