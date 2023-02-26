import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {

    private int indexEntree;

    public Fibonacci(int indexEntree) {
        this.indexEntree = indexEntree;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FiboIterator(indexEntree);
    }


    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(46);
        for (Integer integer : fibonacci) {
            System.out.println(integer);
        }
    }
}
