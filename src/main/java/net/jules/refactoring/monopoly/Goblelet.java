package net.jules.refactoring.monopoly;

public class Goblelet {
    De de1;
    De de2;

    public Goblelet(){
        de1 = new De();
        de2 = new De();
    }

    public void lancer() {
        de1.lancer();
        de2.lancer();
    }

    public int getTotal() {
        return de1.getValeur() + de2.getValeur();
    }

    public boolean isDouble() {
        return de1.equals(de2);
    }
}
