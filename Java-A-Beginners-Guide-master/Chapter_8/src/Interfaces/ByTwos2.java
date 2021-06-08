package Interfaces;
// Demonstrate interface references.
public class ByTwos2 implements Series {
    int start;
    int val;

    ByTwos2() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}
