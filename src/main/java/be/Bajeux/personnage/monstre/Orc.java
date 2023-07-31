package be.Bajeux.personnage.monstre;

import java.util.ArrayList;

public class Orc extends Monstre {

    ArrayList<String> tableDeLoot;
    private static int id = 2;

    public Orc(int stamina, int strenght) {
        super(stamina, strenght +1 );
        this.tableDeLoot = new ArrayList<>();
        this.tableDeLoot = loot.addLoots(2);
    }
}
