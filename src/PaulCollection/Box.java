package PaulCollection;

public class Box {

    private Object inhalt;
    private Box verweis;

    public Box(Object inhalt) {
        this.inhalt = inhalt;
        this.verweis = null;
    }

    public Box(Object inhalt, Box verweis) {
        this.inhalt = inhalt;
        this.verweis = verweis;
    }

    public Box getVerweis() {
        return verweis;
    }

    public Object getInhalt() {
        return inhalt;
    }

    public void setInhalt(Object inhalt) {
        this.inhalt = inhalt;
    }

}
