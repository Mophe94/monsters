package be.Bajeux.mecanisme.loot;

import be.Bajeux.mecanisme.Utile;

import java.util.ArrayList;

public class LootImpl implements Loot {

    @Override
    public ArrayList addLoots(int id) {
        ArrayList<String> loots = new ArrayList<>();

        switch (id) {
            case 1:
                for (int i = 0; i < Utile.lancerDe(4, 1, 1); i++) {
                    loots.add("Cuir");
                }
                break;
            case 2:
                for (int i = 0; i < Utile.lancerDe(6, 1, 1); i++) {
                    loots.add("or");
                }
                break;
            case 3:
                for (int i = 0; i < Utile.lancerDe(6, 1, 1); i++) {
                    loots.add("or");
                }
                for (int i = 0; i < Utile.lancerDe(4, 1, 1); i++) {
                    loots.add("cuir");
                }
                break;
        }
        return loots;
    }
}

