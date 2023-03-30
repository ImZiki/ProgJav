package RadioStation;


public class PlaybackSequence extends AudioElement {
    private AudioElement[] playList;
    private static final int MAX = 100;
    private int cantidad;
    private boolean full = false;

    public PlaybackSequence(String name) {
        super(name);
        playList = new AudioElement[MAX];
        cantidad = 0;
    }

    public boolean full(){
        if(cantidad == playList){
            full = true;
        }
    }


    public void add(AudioElement p){
        if(!full){
            playList[cantidad] = p;
            cantidad++;
        }
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
