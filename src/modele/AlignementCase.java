package modele;

import java.util.LinkedList;

public class AlignementCase {
    private Orientation orientation;
    private LinkedList<Case> lesCases;
    private int position;

    public AlignementCase(Orientation orientation, LinkedList<Case> lesCases, int position) {
        this.orientation = orientation;
        this.lesCases = lesCases;
        this.position = position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public LinkedList<Case> getLesCases() {
        return lesCases;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

/*    public LinkedList<Case> getCasesLibre() {
        return ;
    }

    public Case getCaseNum(int num){
        return ;
    }*/
}
