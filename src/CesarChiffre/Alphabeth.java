package CesarChiffre;

import java.util.ArrayList;
import java.util.HashSet;

public class Alphabeth {

    private char[] alphabeth = new char[36];
    private int key = -1;

    public Alphabeth() {
        alphabeth[0] = 'a';
        alphabeth[1] = 'b';
        alphabeth[2] = 'c';
        alphabeth[3] = 'd';
        alphabeth[4] = 'e';
        alphabeth[5] = 'f';
        alphabeth[6] = 'g';
        alphabeth[7] = 'h';
        alphabeth[8] = 'i';
        alphabeth[9] = 'j';
        alphabeth[10] = 'k';
        alphabeth[11] = 'l';
        alphabeth[12] = 'm';
        alphabeth[13] = 'n';
        alphabeth[14] = 'o';
        alphabeth[15] = 'p';
        alphabeth[16] = 'q';
        alphabeth[17] = 'r';
        alphabeth[18] = 's';
        alphabeth[19] = 't';
        alphabeth[20] = 'u';
        alphabeth[21] = 'v';
        alphabeth[22] = 'w';
        alphabeth[23] = 'x';
        alphabeth[24] = 'y';
        alphabeth[25] = 'z';
        alphabeth[26] = '0';
        alphabeth[27] = '1';
        alphabeth[28] = '2';
        alphabeth[29] = '3';
        alphabeth[30] = '4';
        alphabeth[31] = '5';
        alphabeth[32] = '6';
        alphabeth[33] = '7';
        alphabeth[34] = '8';
        alphabeth[35] = '9';
    }

    public int getIndexFromChar(char c) {
        int index = -1;
        for (int i = 0; i < alphabeth.length; i++) {
            if(alphabeth[i] == c) {
                index = i;
            }
        }
        return index;
    }
    public void setKey(int key) {
        this.key = key;
    }

    public char getCharFromIndex(int index) {
        return alphabeth[index];
    }

    public char encryptChar(char c) {
        char encryptedC = '-';
        int CIndex = getIndexFromChar(c);
        encryptedC = getCharFromIndex((CIndex + key)%36);

        return encryptedC;
    }

    public char decryptChar(char c) {
        char decryptedC = '-';
        int CIndex = getIndexFromChar(c);
        decryptedC = getCharFromIndex((CIndex + (36-key))%36);
        return decryptedC;
    }
}
