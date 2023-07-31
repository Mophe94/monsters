package be.Bajeux.personnage.monstre;

import java.util.ArrayList;

public class Dragon extends Monstre {
    ArrayList<String> tableDeLoot;
    private static int id = 3;

    public Dragon(int stamina, int strenght) {
        super(stamina +1 , strenght);
        this.tableDeLoot = new ArrayList<>();
        this.tableDeLoot = loot.addLoots(3);
    }
}
