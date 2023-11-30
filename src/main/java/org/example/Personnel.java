package org.example;

public class Personnel {
    private Employe[] employes;
    private int nbEmployes;

    public Personnel() {
        employes = new Employe[10];
        nbEmployes = 0;
    }

    public void ajouterEmploye(Employe employe) {
        if (nbEmployes < 10) {
            employes[nbEmployes++] = employe;
        } else {
            System.out.println("La limite d'employés est atteinte.");
        }
    }

    public void calculerSalaires() {
        for (int i = 0; i < nbEmployes; i++) {
            System.out.println(employes[i].getNom() + " gagne " + employes[i].calculerSalaire() + " euros.");
        }
    }

    public double salaireMoyen() {
        double totalSalaire = 0;
        for (int i = 0; i < nbEmployes; i++) {
            totalSalaire += employes[i].calculerSalaire();
        }
        return totalSalaire / nbEmployes;
    }
}
