package Chapter9.Soru06;

public class Kronometre {
    private long startTime = System.currentTimeMillis();
    private long entTime;

    public Kronometre(){
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.entTime = System.currentTimeMillis();
    }

    public int getElapsedTime(){
        return (int)(entTime - startTime);
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEntTime() {
        return entTime;
    }
}
