package Project2_ImparteSurprize;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

   private final Factory bagFactory = Factory.getBagFactory();
   private IBag bag;
   private int waitTime;

   public AbstractGiveSurprises(String bagType, int waitTime){
       this.bag = bagFactory.makeBag(bagType);
       this.waitTime = waitTime;
   }

   public void put(ISurprise newSurprise){
       this.bag.put(newSurprise);
   }

    public void put(IBag surprises){
      this.bag.put(surprises);
    }

    public void give(){
       this.bag.takeOut().enjoy();
       this.giveWithPassion();
    }

    public void giveAll(){
       while(this.bag != null && !this.bag.isEmpty()){
           give();
           try {
               TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
           } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
               // Sleep for X seconds - code snippet
           }
       }
    }

    public boolean isEmpty(){
       return this.bag.isEmpty();
    }

    abstract void giveWithPassion();
}

