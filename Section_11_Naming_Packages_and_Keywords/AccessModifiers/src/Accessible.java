public interface Accessible {

    // Without specifying an access level, it defaults to being accessible only within the package
    int SOME_CONSTANT = 100;

    // Public access can be accessed everywhere. 
    public void methodA();
    void methodB();
    boolean methodC();
}
