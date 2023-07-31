package be.Bajeux.personnage.heros;

import be.Bajeux.personnage.Personnage;

import java.util.ArrayList;

public abstract class Héros extends Personnage {

    private ArrayList<String> inventaire;
    public Héros(int stamina, int strenght) {
        super(stamina, strenght);
    }

    public ArrayList<String> getInventaire() {
        return inventaire;
    }

    public void setInventaire(ArrayList<String> inventaire) {
        this.inventaire = inventaire;
    }
}
