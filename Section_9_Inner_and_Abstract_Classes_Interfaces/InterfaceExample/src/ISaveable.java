import java.util.List;

// Interfaces are used to introduce a list of possible methods to be used by the class that implements it.
// The classes then override the abstract methods given in the interface as seen in the Monster and Player classes.
// They both need the read and write methods, but they are able to be slightly different in each class.
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
