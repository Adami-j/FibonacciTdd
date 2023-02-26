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
            resultat = 1;
            System.out.println(resultat);
        }else if(indexCourrant== 1){
            termeCourrant = 1;
            resultat = termeCourrant;
            System.out.println(resultat);
        }else if(indexCourrant== 2){
            resultat = termeCourrant;
            System.out.println(resultat);

        }else {
            System.out.println("indexCourrant = " + indexCourrant);
            System.out.println(termeCourrant+" + "+termeSuivant);
            resultat = termeCourrant + termeSuivant;
            termeCourrant = termeSuivant;
            termeSuivant = resultat;

            System.out.println(resultat);

        }

        return resultat;
    }
}
