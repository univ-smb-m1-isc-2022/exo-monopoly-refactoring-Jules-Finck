package net.jules.refactoring.monopoly;

import java.util.ArrayList;

public class Quartier {

    private final String couleur;

    private ArrayList<CaseConstructible> caseConstructibles;

    public Quartier(String couleur) {
        this.couleur = couleur;
        this.caseConstructibles = new ArrayList<>();
    }

    public void addCase(CaseConstructible caseConstructible) {
        caseConstructibles.add(caseConstructible);
    }

    public String getCouleur() {
        return couleur;
    }

    public int getSize() {
        return caseConstructibles.size();
    }
}
