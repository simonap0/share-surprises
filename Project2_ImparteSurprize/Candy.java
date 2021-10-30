package Project2_ImparteSurprize;

import java.util.Random;

public class Candy implements ISurprise{

    private int candiesNo;
    private String candiesType;
    private String candiesMessage;
    private static String[] CANDIES_TYPE = {"chocolate", "jelly", "fruits", "vanilla", "milk"};
    private static Random random = new Random();

    public Candy(int candiesNo, String type){
        this.candiesNo = candiesNo;
        this.candiesType = type;
    }

    public Candy(String message){
        this.candiesMessage = message;
    }

    @Override
    public void enjoy(){
        System.out.println("Numarul de bomboane: " + this.candiesNo + " Tipul de bomboane: " + this.candiesType);
    }

    public static Candy generate(){
        int candiesNo;
        if ((candiesNo = random.nextInt(100)) > 0) {
            Candy candy = new Candy(candiesNo, CANDIES_TYPE[random.nextInt(CANDIES_TYPE.length)]);
            return candy;
        }
        return generate();
    }
}

