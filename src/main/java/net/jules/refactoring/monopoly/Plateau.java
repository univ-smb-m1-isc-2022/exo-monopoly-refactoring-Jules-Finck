package net.jules.refactoring.monopoly;

import java.util.ArrayList;

public class Plateau {

    public Case depart;
    public Case impot;
    public Case prison;
    public Case luxe;
    public Case allerenprison;
    private ArrayList<CaseConstructible> caseSansProprietaire = new ArrayList<>();

    public Plateau(){
        ArrayList<Case> cases = new ArrayList<>();
        creerLesCases(cases);
        creerLesCasesSuivantes(cases);
        genererListeCaseSansProprietaire(cases);
    }

    private void creerLesCases(ArrayList<Case> cases){
        depart = new CaseSpeciale("Depart");
        cases.add(depart);
        Quartier quartier = new Quartier("v");
        cases.add(new CaseConstructible("Boulevard de Bellevile", 20, 2,quartier));
        cases.add(new CaseConstructible("Rue Lecourbe", 40, 4, quartier));
        quartier = new Quartier("b");
        cases.add(new CaseConstructible("Rue Vaugirard", 60, 6,quartier));
        cases.add(new CaseConstructible("Rue De Courcelles", 60, 6,quartier));
        cases.add(new CaseConstructible("Avenue de la Republique", 80, 8,quartier));
        quartier = new Quartier("p");
        cases.add(new CaseConstructible("Avenue de Neuilly", 100, 10,quartier));
        cases.add(new CaseConstructible("Boulevard de la Villette", 100, 10,quartier));
        cases.add(new CaseConstructible("Rue de Paradis", 120, 12,quartier));
        quartier = new Quartier("o");
        cases.add(new CaseConstructible("Avenue Mozart", 140, 14,quartier));
        cases.add(new CaseConstructible("Boulevard St Michel", 140, 14,quartier));
        cases.add(new CaseConstructible("Place Pigalle", 160, 16,quartier));
        quartier = new Quartier("r");
        cases.add(new CaseConstructible("Boulevard Malesherbes", 180, 18,quartier));
        cases.add(new CaseConstructible("Avenue Matignon", 180, 18,quartier));
        cases.add(new CaseConstructible("Avenue Henri Martin", 200, 20,quartier));
        quartier = new Quartier("j");
        cases.add(new CaseConstructible("Place de la Bourse", 220, 22,quartier));
        cases.add(new CaseConstructible("Faubourg St Honore", 220, 20,quartier));
        cases.add(new CaseConstructible("Rue de la Fayette", 240, 24,quartier));
        quartier = new Quartier("w");
        cases.add(new CaseConstructible("Avenue Foch", 260, 26,quartier));
        cases.add(new CaseConstructible("Avenue de Breteuil", 260, 26,quartier));
        cases.add(new CaseConstructible("Boulevard des Capucines", 280, 28,quartier));
        quartier = new Quartier("g");
        cases.add(new CaseConstructible("Avenue des Champs Elysees", 300, 30,quartier));
        cases.add(new CaseConstructible("Rue de la paix",350,35,quartier));
        impot = new CaseSpeciale("Impot sur le Revenu");
        cases.add(impot);
        luxe = new CaseSpeciale("Taxe de Luxe");
        cases.add(luxe);
        prison = new CaseSpeciale("Prison");
        cases.add(prison);
        allerenprison = new CaseSpeciale("Aller en Prison");
        cases.add(allerenprison);
        quartier = new Quartier("gare");
        cases.add(new CaseConstructible("Gare De Lyon",120,25,quartier));
        cases.add(new CaseConstructible("Gare Mont-Parnasse",120,25,quartier));
        cases.add(new CaseConstructible("Gare Du Nord",120,25,quartier));
        cases.add(new CaseConstructible("Gare Saint-Lazar",120,25,quartier));
    }

    private void creerLesCasesSuivantes(ArrayList<Case> cases){
        for (int i = 0; i < cases.size() - 1; i++) {
            cases.get(i).setSuivante(cases.get(i + 1));
        }
        cases.get(cases.size() - 1).setSuivante(cases.get(0));
    }

    private void genererListeCaseSansProprietaire(ArrayList<Case> cases){
        for (Case c:cases){
            if (c instanceof CaseConstructible){
                caseSansProprietaire.add((CaseConstructible) c);
            }
        }
    }

    public ArrayList<CaseConstructible> getCaseAchetable(){
          return caseSansProprietaire;
    }
}
