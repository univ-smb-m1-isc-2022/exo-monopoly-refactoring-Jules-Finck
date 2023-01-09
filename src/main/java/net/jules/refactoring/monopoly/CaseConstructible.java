package net.jules.refactoring.monopoly;

public class CaseConstructible extends Case{

    private final int coutAchat;
    private final int loyer;

    private final Quartier quartier;

    public CaseConstructible(String name, int coutAchat, int loyer, Quartier quartier) {
        super(name);
        this.coutAchat = coutAchat;
        this.loyer = loyer;
        this.quartier=quartier;
        quartier.addCase(this);
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

    public int nombreProprieteDeLaCouleur(String couleur){
        if (couleur=="v"){
                return 2;}
        else if (couleur=="b"){
                return 3;}
        else if (couleur== "p"){
                return 3;}
        else if (couleur=="o"){
                return 3;}
        else if (couleur=="r"){
                return 3;}
        else if (couleur=="j"){
                return 3;}
        else if (couleur=="w"){
                return 3;}
        else if (couleur=="g"){
                return 2;}
        else return 0;
     }


}
