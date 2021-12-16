package CesarChiffre;

public class CesarChiffre {

    public static String verschlüsseln(String nachricht, int verschiebung) {
        char c;
        int zahlwert;
        int verschluesselt;
        String geheimtext = "";

        for (int i = 0; i < nachricht.length(); i++) {
            c = nachricht.toLowerCase().charAt(i);
            zahlwert = (int) c-96;
            verschluesselt = ((zahlwert + verschiebung) % 26) + 96;
            geheimtext += (char) verschluesselt;
        }
        return geheimtext;
    }
}
