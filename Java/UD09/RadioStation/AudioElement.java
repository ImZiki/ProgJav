package RadioStation;

public abstract class AudioElement {
    private String name;

    public AudioElement(String name){
        this.name = name;
    }

    public abstract int duration();
    public abstract void play();
    public abstract int profit();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "AudioElement [name=" + name + "]";
    }
    
}
