package modele;

abstract public class Joueur {
    private String nom;

    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    abstract public void aJoueEn(Position p);
}
