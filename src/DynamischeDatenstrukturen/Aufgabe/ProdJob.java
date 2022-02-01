package DynamischeDatenstrukturen.Aufgabe;

public class ProdJob{

    private int prio;
    private String bez;
    private ProdJob next;

    public ProdJob(String bez,int prio, ProdJob next) {
        this.bez = bez;
        this.prio = prio;
        this.next = next;
    }

    public void setPrio(int prio) {
        if(prio >= 1) {
            this.prio = prio;
        }
    }

    public void setNext(ProdJob next) {
        this.next = next;
    }

    public ProdJob getNext() {
        return this.next;
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
