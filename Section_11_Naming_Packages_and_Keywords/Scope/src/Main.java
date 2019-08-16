public class Main {

    // The scope of a variable is how accessible it is.
    public static void main(String[] args) {
        String var4 = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        // Example of trying to use a variable that is not accessible here
        // ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        // System.out.println("var3 is not accessible here " + innerClass.var3);


        System.out.println("scopeInstance var1 is " + scopeInstance.getVar1());
        System.out.println(var4);

        scopeInstance.timesTwo();

        System.out.println("*********************");

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
