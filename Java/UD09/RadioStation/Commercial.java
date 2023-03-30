package RadioStation;

public class Commercial extends AudioElement{
    private int profit;
    private String commercialFile;
    
    public Commercial(String name, String commercialFile, int profit) {
        super(name);
        this.profit = profit;
        this.commercialFile = commercialFile;
        
    }

    @Override
    public int duration() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int profit() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
