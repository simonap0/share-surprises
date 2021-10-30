package Project2_ImparteSurprize;

import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void main (String[] args){
        Factory bagFactory = Factory.getBagFactory();
        IBag surprisesBag = bagFactory.makeBag("LIFO");

        surprisesBag.put(Candy.generate());
        surprisesBag.put(FortuneCookie.generate());
        surprisesBag.put(MinionToy.generate());

        if (surprisesBag.isEmpty()) {
            System.out.println("surprisesBag is empty!");
            System.out.println();
        }else{
            System.out.println("surprisesBag is NOT empty!");
            System.out.println();
        }

        ISurprise firstSurprise = surprisesBag.takeOut();
        firstSurprise.enjoy();

        ISurprise secondSurprise = surprisesBag.takeOut();
        secondSurprise.enjoy();

        ISurprise thirdSurprise = surprisesBag.takeOut();
        thirdSurprise.enjoy();

//        ArrayList<ISurprise> surprises = surprisesBag.getSurprises();
//
        if (surprisesBag.isEmpty()) {
            System.out.println("surprisesBag is empty!");
            System.out.println();
        }else{
            System.out.println("surprisesBag is NOT empty!");
            System.out.println();
        }

        RandomBag randomBag = new RandomBag();
        ISurprise[] randomSurprises = GatherSurprises.gather(10);

        for (int i = 0; i < randomSurprises.length; i++) {
            randomBag.put(randomSurprises[i]);
        }

        GiveSurpriseAndApplause giveSurpriseAndApplause = new GiveSurpriseAndApplause("FIFO", 1);
        giveSurpriseAndApplause.put(randomBag);
        giveSurpriseAndApplause.giveAll();

        System.out.println();
        System.out.println();

        GiveSurpriseAndSing giveSurpriseAndSing = new GiveSurpriseAndSing("LIFO", 1);
        giveSurpriseAndSing.put(randomBag);
        giveSurpriseAndSing.giveAll();

        System.out.println();
        System.out.println();

        GiveSurpriseAndHug giveSurpriseAndHug = new GiveSurpriseAndHug("RANDOM", 1);
        giveSurpriseAndHug.put(randomBag);
        giveSurpriseAndHug.giveAll();

        System.out.println();
        System.out.println();


    }
}
