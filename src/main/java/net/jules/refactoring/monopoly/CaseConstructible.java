package net.jules.refactoring.monopoly;

public class CaseConstructible extends Case{
    private Joueur proprietaire;

    private final int coutAchat;
    private final int loyer;

    private final Quartier quartier;

    public CaseConstructible(String name, int coutAchat, int loyer, Quartier quartier) {
        super(name);
        this.coutAchat = coutAchat;
        this.loyer = loyer;
        this.quartier=quartier;
        quartier.addCase(this);
        proprietaire = null;
    }


    public int getCoutAchat() {
        return coutAchat;
    }

    public int getLoyer() {
        return loyer;
    }

    public String getCouleur(){
        return quartier.getCouleur();
    }

    public int nombreProprieteDeLaCouleur(){
        return quartier.getSize();
     }


    public boolean hasProprietaire() {
        return proprietaire != null;
    }

    public Joueur getProprietaire(){
        return proprietaire;
    }

    public void setProprietaire(Joueur joueur) {
        proprietaire = joueur;
    }
}
