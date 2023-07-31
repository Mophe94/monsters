package be.Bajeux.mecanisme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Utile {
    public static int modificateur(int stat1) {
        int stat2;
        if (stat1 <= 5) {
            return stat2 = stat1 - 1;
        } else if (stat1 > 5 && stat1 <= 10) {
            return stat2 = stat1;
        } else if (stat1 > 10 && stat1 <= 15) {
            return stat2 = stat1 + 1;
        } else if (stat1 > 15) {
            return stat2 = stat1 + 2;
        } else return 0; // revenir et placer une exeption ici
    }

    public static int lancerDe(int nbFace, int nbLancer, int nbGarder) {

        List<Integer> result = new ArrayList<>();
        Random rng = new Random();
        for (int i = 0; i < nbLancer; i++) {
            result.add(rng.nextInt(0, nbFace + 1));
        }
        return result.stream()
                .sorted(Comparator.reverseOrder())
                .limit(nbGarder)
                .mapToInt(i -> i)
                .sum();

    }

}
