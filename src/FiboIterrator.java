import java.util.Iterator;

/**
 * Class FiboIterator qui implémente Iterator et qui permet de parcourir les éléments de la suite de Fibonacci
 */
class FiboIterator implements Iterator<Integer> {


    private int indexEntree;
    private int indexCourrant = 0;
    private int termeCourrant = 1;
    private int termeSuivant = 0;

    public FiboIterator(int indexEntree) {
        this.indexEntree = indexEntree;
    }

    /**
     * Méthode hasNext qui permet de savoir si il y a un élément suivant
     * @return true ou false si élément suivant ou non
     * @author ADAMI Julien
     */
    @Override
    public boolean hasNext() {
        return indexCourrant < indexEntree;
    }

    /**
     * Méthode next qui permet de retourner l'élément suivant
     * elle incrémente l'index courrant et calcule le terme suivant
     * le résultat : termeCourrant + termeSuivant
     * le terme courrant devient le terme suivant
     * et le terme suivant prend la valeur du résultat
     * @return le résultat
     * @author ADAMI Julien
     */
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
