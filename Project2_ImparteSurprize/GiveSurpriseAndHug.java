package Project2_ImparteSurprize;

public class GiveSurpriseAndHug extends AbstractGiveSurprises{


    public GiveSurpriseAndHug(String bagType, int waitTime) {
        super(bagType, waitTime);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
        System.out.println();
    }
}
