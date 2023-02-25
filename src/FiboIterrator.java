import java.util.Iterator;

class FiboIterator implements Iterator<Integer> {

    private int range;
    private int current = 0;

    public FiboIterator(int range) {
        this.range = range;
    }

    @Override
    public boolean hasNext() {
        return current < range;
    }

    @Override
    public Integer next() {
        return null;
    }
}
