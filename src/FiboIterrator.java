import java.util.Iterator;

class FiboIterator implements Iterator<Integer> {


    private int range;
    private int current = 0;
    //parametre init à 1 car aucun terme de la suite ne peut être inférieur à 1
    private int previous = 1;

    public FiboIterator(int range) {
        this.range = range;
    }

    @Override
    public boolean hasNext() {
        return current < range;
    }

    @Override
    public Integer next() {
        int result;

        if(this.current==0){
           result = 1;
        }else {
            result = current+ previous;
            previous = current;
            System.out.println(result);

        }
        this.current++;
        return result;
    }
}
