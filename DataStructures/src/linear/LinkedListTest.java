package linear;

public class LinkedListTest {

	public static void main(String[] args) {
//		GenLinkedList<String> strList = new GenLinkedList<String>();
//		GenLinkedList<Integer> intList = new GenLinkedList<Integer>();
//		strList.addFront("Hello");
//		strList.traverse();
//		System.out.println(strList.deleteFront());
//		strList.traverse();
		
		CircularLinkedList<String> strList2 = new CircularLinkedList<String>();
		strList2.traverse();
		strList2.addToBack("Hello");
		strList2.addToBack("My name");
		strList2.addToBack("Is Seth");
		strList2.traverse();
		strList2.addToFront("WHATTTUP");
		strList2.traverse();
		strList2.addToFront("Yo");
		strList2.traverse();
	}

}
