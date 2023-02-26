import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {

    private int indexEntree;

    public Fibonacci(int indexEntree) {
        this.indexEntree = indexEntree;
    }

    /**
     * Méthode iterator qui permet de retourner un itérateur
     * @return un itérateur de Fiboiterateur
     * @author ADAMI Julien
     */
    @Override
    public Iterator<Integer> iterator() {
        return new FiboIterator(indexEntree);
    }


    /**
     * Méthode main qui permet de tester la classe
     * @param args
     * @author ADAMI Julien
     */
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(46);
        for (Integer integer : fibonacci) {
            System.out.println(integer);
        }
    }
}
