public class ScopeCheck {

    public int publicVar = 0;
    private int var1 = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, public var = " + publicVar + ": var3 = " + var1);
    }

    public int getVar1() {
        return var1;
    }

    public void timesTwo() {
        int var2 = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * var2);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("var3 from outer class: " + innerClass.var3);
    }

    public class InnerClass {
        private int var3 = 3;

        public InnerClass() {
            System.out.println("Inner class created, var1 is " + var1 + " var3 is " + var3);
        }

        // This will actually be wrong and the results will be multiplied by 3
        // because of the var3 defined in this inner class
        public void timesTwo() {
            System.out.println("var1 is still available here" + var1);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * var3);
            }
        }
    }
}
