package tutorial5;

/**
 * This is the class template you must implement. This means to replace all TODOs 
 * by meaningful code until all tests in SimpleListTests succeed. 
 * 
 * This is an example of test driven development. The specifications are defined by the test cases.
 * 
 * RULES:
 * 1. You are not allowed to change the definition of the single instance variable
 * 2. You are not allowed to add instance variables
 */


public class SimpleList<E> {
	
	// Generic types cannot be arrays as they are only resolved at runtime
	// While this is an Object array, we maintain type safety by only accessing it with objects of type <E>
	private Object[] array;
	private int size = 0; // Tracks how many elements are stored
	
	public SimpleList() {
		this(10);
	}
	
	public SimpleList(int num) {
		array = new Object[num];
	}
	
	public void add(E element) {
		//TODO
	}
	
	public void remove(int index) {
		//TODO
	}
	
	public E get(int index) {
		//TODO
		return null; // Replace this
	}
	
	public int size() {
		//TODO
		return 0; // Replace this
	}

}
