package Project2_ImparteSurprize;

public final class Factory implements IBagFactory {
    private static Factory bagFactory = new Factory();
    private final BagType[] bagTypes;

    private Factory(){
        bagTypes = BagType.values();
    }

    public static Factory getBagFactory(){
        return bagFactory;
    }

    @Override
    public IBag makeBag(String type) {

    switch(type) {
        case "RANDOM":
            return new RandomBag();
        case "LIFO":
            return new LIFOBag();
        case "FIFO":
            return new FIFOBag();
    }

    return null;
    }
}
