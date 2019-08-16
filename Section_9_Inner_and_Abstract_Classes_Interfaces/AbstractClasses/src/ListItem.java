// An abstract class is used as a superclass that cannot be used to form an object
// The class is meant to be implemented to define general characteristics.
// This makes sense to use if you will have multiple classes that all share common traits.
// Abstract classes are normally an overall idea/descriptor that many classes will fit under.

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
