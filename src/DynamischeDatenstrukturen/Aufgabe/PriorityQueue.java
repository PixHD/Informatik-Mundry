package DynamischeDatenstrukturen.Aufgabe;


public class PriorityQueue {

    private List hList;

    public PriorityQueue(ProdJob job) {
        hList = new List(job);

    }

    public boolean isEmpty() {
        return hList.isEmpty();
    }

    public void dequeue() {
        if(!isEmpty()){
            hList.toFirst();
            hList.remove();
        }
    }

    public void priorityEnqueue(ProdJob job) {
        if (!isEmpty()) {
            hList.toFirst();
            while (hList.getObject().getPrio() <= job.getPrio()) {
                hList.next();
            }
            hList.next();
        }
        hList.insert(job);
    }

    public ProdJob first() {
        hList.toFirst();
        return hList.getObject();
    }


}
