package Aufgaben.Seite78;

import DynamischeDatenstrukturen.Aufgabe.List;

public class Rinne {

    private List rinne;


    public Rinne() {
        rinne = new List();
    }

    public void addKugel(Kugel k) {
        rinne.append(k);
    }

    public Kugel getFirstKugel() {
      rinne.toFirst();
      return (Kugel) rinne.getObject().getItem();
    }

    public String haeufigsteFarbe() {
        /*
        Aufgabe ist es die Anzahl der Kugeln in der Rinne, d.h. hier in dem KOntext die Farbwerte der Listenelemente vom Typ Kugel zu Zählen.
        Um die entsprechende Anzahl an Farbwerten zu verarbeiten, müssen drei Lokale Variabeln vom Typ int bereitgestellt werden.
        Mitteln einer vorzugsweise while-Schleife wird durch die Liste iterriert und dabei für jedes Element der entsprechende Zahlenwert in der jweiligen passenden Variable um ein erhöht.
        Der Aufwand beträgt hierbei O(n).
        Nach erfolgreichem Durchlaufen wird der höchste Wert durch mehrfachen paarweise Verlgiech ermittelt und bei gleichehit die Anzahl des Farbwerts der schwereren Kugel ausgegeben.
         */
        if(rinne.isEmpty()) return null;
        int gelb = 0;
        int rosa = 0;
        int blau = 0;
        rinne.toFirst();
        while(rinne.hasAccess()) {
            if(((Kugel) rinne.getObject().getItem()).getFarbe() == Farbe.ROSA) rosa++;
            if(((Kugel) rinne.getObject().getItem()).getFarbe() == Farbe.GELB) gelb++;
            if(((Kugel) rinne.getObject().getItem()).getFarbe() == Farbe.BLAU) blau++;
            rinne.next();
        }
        if(gelb > rosa && gelb > blau) {
            return "Gelb: " + gelb;
        }else if(rosa > gelb && rosa > blau) {
            return "Rosa: " + rosa;
        }else if(blau > rosa && blau > gelb) {
            return "Blau: " + blau;
        }


        return null;
    }


}
