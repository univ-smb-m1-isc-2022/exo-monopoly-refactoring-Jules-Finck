package net.jules.refactoring.monopoly;

public class De {

    private int valeurFace;
    public De() {
        valeurFace = 1;
    }

    public int getValeur() {
        return valeurFace;
    }

    public void lancer() {
        valeurFace = (int) (Math.random() * 6) + 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof De)) return false;
        return valeurFace == ((De) obj).valeurFace;
    }
}