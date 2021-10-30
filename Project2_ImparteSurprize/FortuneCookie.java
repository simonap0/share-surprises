package Project2_ImparteSurprize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise{

    private String fortuneCookieMessage;
    private static final String[] movieQuotes = {
                    "\"May the Force be with you.\" -Star Wars, 1977",
                    "\"There's no place like home.\" -The Wizard of Oz, 1939",
                    "\"Carpe diem. Seize the day, boys. Make your lives extraordinary.” -Dead Poets Society, 1989",
                    "“My mama always said life was like a box of chocolates. You never know what you're gonna get.” -Forrest Gump, 1994",
                    "“You're gonna need a bigger boat.” -Jaws, 1975",
                    "“Here's looking at you, kid.” -Casablanca,1942",
                    "“Houston, we have a problem.” -Apollo 13, 1995",
                    "“You can't handle the truth!” -A Few Good Men, 1992",
                    "“A martini. Shaken, not stirred.” - Goldfinger, 1964",
                    "“If you build it, he will come.” -Field of Dreams, 1989",
                    "“Keep your friends close, but your enemies closer.” -The Godfather Part II, 1974",
                    "“Just keep swimming.” -Finding Nemo, 2003",
                    "“You is kind. You is smart. You is important.” -The Help, 2011",
                    "“Hasta la vista, baby.” -Terminator 2: Judgment Day, 1991",
                    "“Nobody puts Baby in a corner.” -Dirty Dancing, 1987",
                    "\"Why so serious?\" - The Dark Knight, 2008",
                    "\"A million dollars isn't cool. You know what's cool? A billion dollars.\" - The Social Network, 2010",
                    "\"Life moves pretty fast. If you don’t stop and look around once in a while, you could miss it.\" - Star Wars: Episode V – The Empire Strikes Back",
                    "\"You want to get out of the hole? First you’re going to have to put down the shovel.\" - The Secret Life of Walter Mitty",
                    "\"You’ve got this. Most of the time, the challenges you face are those you were already built to handle\" - Dumbo"};
    private static Random random = new Random();

    public FortuneCookie(String message){
        this.fortuneCookieMessage = message;
    }

    @Override
    public void enjoy(){
        System.out.println("Guidance movie quote: " + this.fortuneCookieMessage);
    }

    public static FortuneCookie generate(){
        String fortuneCookieMessage = movieQuotes[random.nextInt(movieQuotes.length)];
        return new FortuneCookie(fortuneCookieMessage);
    }
}

