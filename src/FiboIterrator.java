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
        if(indexCourrant== 0){
            return 1;
        }else if(indexCourrant== 1){
            termeCourrant = 1;
            resultat = termeCourrant;
            return 1;
        }else if(indexCourrant== 2){
            resultat = termeCourrant;
            return 1;
        }else {
            resultat = termeCourrant + termeSuivant;
            termeSuivant = resultat;
           // System.out.println("indexCourrant: " + indexCourrant+ " indexEntree: " + indexEntree + " termeCourrant: " + termeCourrant + " termeSuivant: " + termeSuivant + " resultat: " + resultat);
        }
        return resultat;
    }
}
