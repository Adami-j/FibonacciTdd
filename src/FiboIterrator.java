import java.util.Iterator;

class FiboIterator implements Iterator<Integer> {


    private int indexEntree;
    private int indexCourrant = 0;
    private int termeCourrant = 1;
    private int termeSuivant = 0;

    public FiboIterator(int indexEntree) {
        this.indexEntree = indexEntree;
    }

    @Override
    public boolean hasNext() {
        return indexCourrant < indexEntree;
    }

    @Override
    public Integer next() {
            indexCourrant++;
             int resultat = 0;
            resultat = termeCourrant + termeSuivant;
            termeCourrant = termeSuivant;
            termeSuivant = resultat;

        return resultat;
    }
}
