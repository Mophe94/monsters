package be.Bajeux.personnage.monstre;


import be.Bajeux.mecanisme.loot.Loot;
import be.Bajeux.personnage.Personnage;



public abstract class Monstre extends Personnage {

    protected Loot loot;

    public Monstre(int stamina, int strenght) {
        super(stamina, strenght);

    }


}

