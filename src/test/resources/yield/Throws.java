package yield;

public final class Throws {

    /**
     * @sharpen.ignore
     * @sharpen.yield
     */
    public static class Marker extends Exception {
    }

    public void test() throws Marker {
        if (true) return;
        test2(123);
        return;
    }

    public void test2(int x) throws Marker {
        return;
    }
}
