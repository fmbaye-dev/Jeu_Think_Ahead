package modele;

public class JoueurOrdinateur extends Joueur {
    private String typeDeJeu;
    private int niveau;

    public JoueurOrdinateur(String nom, String typeDeJeu, int niveau) {
        super(nom);
        this.typeDeJeu = typeDeJeu;
        this.niveau = niveau;
    }

    public String getTypeDeJeu() {
        return typeDeJeu;
    }

    public int getNiveau() {
        return niveau;
    }

    @Override
    public void aJoueEn(Position p) {

    }
}
