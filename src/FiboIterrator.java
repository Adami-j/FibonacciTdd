import java.util.Iterator;

class FiboIterator implements Iterator<Integer> {


    private int indexEntree;
    private int indexCourrant = 0;
    private int termeCourrant = 1;
    private int termeSuivant = 1;


    //parametre init à 1 car aucun terme de la suite ne peut être inférieur à 1
    private int previous = 1;

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
        if(indexCourrant<=2){
            resultat = 1;
            resultat = termeCourrant;
        }else {
            resultat = termeCourrant + termeSuivant;
            termeCourrant = termeSuivant;
            termeSuivant = resultat;
        }
        return resultat;
    }
}
