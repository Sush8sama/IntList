package intlist;


/**
 *@invar | getLength() >= 0
 *
 */

public class IntList {
	/**
	 * @referenceobject
	 */
	private int[] elements;


public int getLength() {
	return elements.length;
}

public int getElementAtIndex(int index) {
	return elements[index];
}

public int[] getElementsArray() {
	return elements.clone();
}

/**
 * @mutates | 
 */
public IntList() {
	elements = new int[0];
}

/**
 * @inspects | this
 * @mutates | this
 * @post | getLength() == old(getLength()) + 1
 * @post | getElementAtIndex(getLength() - 1) == element
 */

public void addElement(int element) {
	int length = elements.length;
	int[] new_elements = new int[length + 1];
	for(int i = 0; i < length; i++) {
		new_elements[i] = elements[i];
}
	new_elements[length] = element;
	 elements = new_elements;
}

/**
 * @throws IllegalArgumentException | getLength() == 0
 * @inspects | this
 * @mutates | this
 * @post | getLength() == old(getLength()) - 1
 * 
 */
public void removeElement() {
	int length = elements.length;
	if (length == 0) {
		throw new IllegalArgumentException("Index_Of_Bound");
	}
	int[] new_elements = new int[length - 1];
	for(int i = 0; i < length-1; i++) {
		new_elements[i] = elements[i];
}
	 elements = new_elements;
}

}
