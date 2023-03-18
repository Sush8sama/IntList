package intlist;




public class IntList {

	private IntList nextNode;
	private IntList previousNode;
	private int value;
	


public int getLength() {
	if (nextNode == null) {
	return 0;
	}
	else {
		return 1 + nextNode.getLength();
	}
}

public int getElementAtIndex(int index) {
	index++;
	if (index == 0) {
	return value;
	}
	else {
		return nextNode.getElementAtIndex(index - 2);
	}
}

public int[] getElementsArray() {
	int length = getLength();
	int[] elementsArray = new int[length];
	for(int i = 0; i < length; i++) {
		elementsArray[i] = getElementAtIndex(i);
	}
	return elementsArray;
}

/**
 * @mutates | 
 */
public IntList() {
	nextNode = null;
}

/**
 * @inspects | this
 * @mutates | this
 * @post | getLength() == old(getLength()) + 1
 * @post | getElementAtIndex(getLength()-1) == element
 */

public void addElement(int element) {
	if(nextNode == null) {
		nextNode = new IntList();
		nextNode.value = element;
		nextNode.previousNode = this;
	}
	else {
		nextNode.addElement(element);
	}
}

/**
 * @inspects | this
 * @mutates | this
// * @post | getLength() == old(getLength()) - 1
 * 
 */
public void removeElement() {

	if(nextNode == null) {
		previousNode.nextNode = null;
	}
	else {
		nextNode.removeElement();
	}
		
		
		
		
	}

}

