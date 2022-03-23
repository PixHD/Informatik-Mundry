package DynamischeDatenstrukturen.Aufgabe;


public class Kugel {
    private int gewicht;
    private Farbe farbe;

    public Kugel(int gewicht) {
        if(!(gewicht == 10 || gewicht == 8 || gewicht == 6)) return;
        this.gewicht = gewicht;
        switch(gewicht) {
            case 10:
                this.farbe = Farbe.BLAU;
                break;
            case 8:
                this.farbe = Farbe.GELB;
                break;
            case 6:
                this.farbe = Farbe.ROSA;
                break;
            default:
                break;
        }
    }

    public Kugel(Farbe farbe) {
        this.farbe = farbe;
        switch(farbe) {
            case BLAU:
                this.gewicht = 10;
                break;
            case GELB:
                this.gewicht = 8;
                break;
            case ROSA:
                this.gewicht = 6;
                break;
            default:
                break;
        }
    }

    public Farbe getMost(List list) {
        int countBlue = 0;
        int countYellow = 0;
        int countPink = 0;


        if(countBlue>countYellow && countBlue>countPink) {
            return Farbe.BLAU;
        }else iif(countBlue>countYellow && countBlue>countPink) {
            return Farbe.BLAU;
        }

    }

}
