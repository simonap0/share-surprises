package Project2_ImparteSurprize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class LIFOBag implements IBag{

    ArrayList<ISurprise> surprises= new ArrayList<>();
    Random random = new Random();

    @Override
    public void put(ISurprise newSurprise) {
        surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        surprises.addAll(surprises.size(), bagOfSurprises.getSurprises());
    }

    @Override
    public ISurprise takeOut() {
        ISurprise newSurpise = surprises.remove(surprises.size() - 1);
        return newSurpise;
    }

    @Override
    public boolean isEmpty() {
        return surprises.isEmpty();
    }

    @Override
    public int size() {
        return surprises.size();
    }

    @Override
    public ArrayList<ISurprise> getSurprises() {
        return surprises;
    }
}
