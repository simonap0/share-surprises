package Project2_ImparteSurprize;

import java.util.Random;

public final class GatherSurprises {

    private GatherSurprises(){}

    private static Random random = new Random();

    public static ISurprise[] gather(int n){
        ISurprise[] surprises = new ISurprise[n];
        for (int i = 0; i < n; i++) {
            surprises[i] = GatherSurprises.gather();
        }
        return surprises;
    }

    public static ISurprise gather(){
        int n  = random.nextInt(3);

        switch (n) {
            case 0:
                return FortuneCookie.generate();
            case 1:
                return Candy.generate();
            case 2:
                return MinionToy.generate();
        }
        return null;
    }
}
