package DynamischeDatenstrukturen.Aufgabe;

public class ProdJob{

    private int prio;
    private String bez;

    public ProdJob(String bez,int prio) {
        this.bez = bez;
        this.prio = prio;
    }

    public void setPrio(int prio) {
        if(prio >= 1) {
            this.prio = prio;
        }
    }

    public int getPrio() {
        return this.prio;
    }

    public void setBez(String bez) {
        this.bez = bez;
    }

    public String getBez() {
        return this.bez;
    }


}