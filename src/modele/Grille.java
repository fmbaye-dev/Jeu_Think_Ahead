package modele;

public class Grille {
    private AlignementCase alignementActif;
    private Case [] lesCases;

    public Grille(AlignementCase alignementActif, Case[] lesCases) {
        this.alignementActif = alignementActif;
        this.lesCases = lesCases;
    }

    /*public Case getCase(Position pos){

    }*/

    public boolean selectionCase(Position pos, Joueur joueur){
        return true;
    }

    public void setAlignementActif(int num, Orientation orientation ){

    }
}
