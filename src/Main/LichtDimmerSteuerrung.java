package Main;

public class LichtDimmerSteuerrung {

    private int helligkeit = 50;
    private int schrittweite;
    private int max;

    public LichtDimmerSteuerrung(int max) {
        this.max = max;
        this.schrittweite = 5;
    }

    public void heller() {
        if(helligkeit+schrittweite <= max) {
            helligkeit = helligkeit + max;
        }
    }
    public void dunkler() {
        if(helligkeit - schrittweite >= 0) {
            helligkeit = helligkeit-schrittweite;
        }
    }

    public int getHelligkeit() {
        return helligkeit;
    }
}
