import java.util.Iterator;

class FiboIterator implements Iterator<Integer> {

    int arrivee;
    public FiboIterator(int arrivee) {
        this.arrivee = arrivee;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        int resultat=0;
        if(arrivee==0){
            resultat=0;
        }else if(arrivee==1){
            resultat=1;
        }
        return resultat;
    }
}
