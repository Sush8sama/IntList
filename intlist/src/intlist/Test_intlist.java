package intlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_intlist {

	@Test
	void test() {
		IntList list1 = new IntList();
		int[] array1 = {};
		assertArrayEquals(array1, list1.getElementsArray());
		assertEquals(0, list1.getLength());
		list1.addElement(5);
		list1.addElement(3);
		list1.addElement(7);
		list1.addElement(8);
		
		int[] array2 = {5, 3, 7, 8};
		assertEquals(4, list1.getLength());
		assertArrayEquals(array2, list1.getElementsArray());
		assertEquals(3, list1.getElementAtIndex(1));
		int a = list1.getElementAtIndex(1);
		a = 99;
		assertEquals(3, list1.getElementAtIndex(1));
		assertEquals(99, a);
		int[] array_elements = list1.getElementsArray();
		array_elements[1] = 99;
		assertEquals(3, list1.getElementAtIndex(1));
		list1.removeElement();
		int[] array3 = {5, 3, 7};
		assertArrayEquals(array3, list1.getElementsArray());


		



		
	}

}
