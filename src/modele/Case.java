package modele;

public class Case {
    private int valeur;
    private Joueur jouerPar;
    private Position position;

    public Case(int valeur, Joueur jouerPar, Position position) {
        this.valeur = valeur;
        this.jouerPar = jouerPar;
        this.position = position;
    }

    public void estLibre(){

    }

    public int getValeur() {
        return valeur;
    }

    public Joueur getJouerPar() {
        return jouerPar;
    }

    public Position getPosition() {
        return position;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setJouerPar(Joueur jouerPar) {
        this.jouerPar = jouerPar;
    }
}
