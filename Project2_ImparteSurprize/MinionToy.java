package Project2_ImparteSurprize;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {

    private String minionName;
    private String minionToyMessage;
    private static final String[] MINION_NAME= {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
    private static int minionSelector = 0;

    public MinionToy(String name){
       this.minionName = name;
    }

    @Override
    public void enjoy() {
        System.out.print("Nume minion: ");
        System.out.println(this.minionName);
    }

    public static MinionToy generate(){
        String name = MINION_NAME[minionSelector];
        minionSelector = (minionSelector + 1) % MINION_NAME.length;
        return new MinionToy(name);
    }

}
