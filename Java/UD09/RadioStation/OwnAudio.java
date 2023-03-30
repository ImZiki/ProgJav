package RadioStation;

public class OwnAudio extends AudioElement{
    private String ownFile;

    public OwnAudio(String name, String ownFile) {
        super(name);
        this.ownFile = ownFile;
    }

    @Override
    public int duration() {
        return 0;
    }

    @Override
    public void play() {

    }

    @Override
    public int profit() {
        return 0;
    }
    
}
