package modele;

public class JoueurHumain extends Joueur{
    private String prenom;

    public JoueurHumain(String nom, String prenom) {
        super(nom);
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public void aJoueEn(Position p) {

    }
}
