package be.Bajeux.personnage.monstre;

import be.Bajeux.mecanisme.loot.Loot;

import java.util.ArrayList;

public class Loup extends Monstre {

    ArrayList<String> tableDeLoot;
    private static int id = 1;

    public Loup(int stamina, int strenght) {
        super(stamina, strenght);
        this.tableDeLoot = new ArrayList<>();
        this.tableDeLoot = loot.addLoots(getId()) ;
    }

    public static int getId() {
        return id;
    }
    }

