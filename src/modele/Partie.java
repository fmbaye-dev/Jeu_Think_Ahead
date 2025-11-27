package modele;

import java.util.LinkedList;

public class Partie {
    private Grille laGrille;
    private Joueur [] joueurs;
    private LinkedList<Coup> lesCoups;
    private int [] score;

    public Partie(Grille laGrille, Joueur[] joueurs, LinkedList<Coup> lesCoups, int[] score) {
        this.laGrille = laGrille;
        this.joueurs = joueurs;
        this.lesCoups = lesCoups;
        this.score = score;
    }

   /* public Joueur getJoueur(int j){

    }*/

    public Grille getLaGrille() {
        return laGrille;
    }

    public void commencer() {

    }

/*    public int [] getScore() {

    }*/

    public void ajouterCoup(Coup coup){

    }

    public void annulerCoup(int nbr) {

    }
}
