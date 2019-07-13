public class Main {

    public static void main(String[] args) {
	    MyLinkedList list = new MyLinkedList(null);
	    list.traverse(list.getRoot());

	    String stringData = "5 8 6 2 3 7 4 1 0";

	    String[] data = stringData.split(" ");
	    for (String s: data) {
	        list.addItem(new Node(s));
        }

	    list.traverse(list.getRoot());
    }
}
