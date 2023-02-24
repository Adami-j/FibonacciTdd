import java.util.Iterator;

class FiboIterator implements Iterator<Integer> {

    int depart;
    int actuel;
    int arrivee;
    public FiboIterator(int arrivee) {
        this.arrivee = arrivee;
        this.depart = 0;
        actuel = 0;
    }

    @Override
    public boolean hasNext() {

        return depart < arrivee;
    }

    @Override
    public Integer next() {
        int resultat=0;
        if(arrivee==0){
            resultat=0;
        }else if(arrivee==1){
            resultat=1;
        }
        depart++;
        return resultat;
    }
}
