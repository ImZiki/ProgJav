package RadioStation;

public class Song extends AudioElement {
    private String songFile;
    private int cost;
    private int duration;

    public Song(String name, String songFile, int cost){
        super(name);
        this.songFile = songFile;
        this.cost = cost;
    }

    @Override
    public int duration(){
        return duration;//temp
    }

    @Override
    public void play() {
                
    }

    @Override
    public int profit(){
        int profit = 1;//temp
        return cost - profit;
    }

    public String getFile() {
        return songFile;
    }

    public int getCost() {
        return cost;
    }

    public void setFile(String file) {
        this.songFile = file;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Song file=" + songFile + ", cost=" + cost + super.toString();
    }
    

    
}
