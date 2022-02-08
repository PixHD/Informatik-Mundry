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
            while (hList.hasAccess() && job.getPrio() >= ((ProdJob) hList.getObject().getItem()).getPrio()) {
                hList.next();
            }
            if(hList.hasAccess()) {
                hList.insert(job);
            }else {
                hList.append(job);
            }

        }else {
            hList.append(job);
        }
    }

    public ProdJob first() {
        hList.toFirst();
        return (ProdJob) hList.getObject().getItem();
    }


}
