package yield;

public final class ThrowsSuper {

    /**
     * @sharpen.ignore
     * @sharpen.yield
     */
    public static class Marker extends Exception {
    }

    public static class Base {
        public void test() throws Marker {
            return;
        }
    }

    public static class Child extends Base {
        public void test() throws Marker {
            super.test();
            return;
        }
    }
}
