public abstract class Bil {
    private String regNr;
    private String mærke;
    private String model;
    private int årgang;
    private int antaldøre;

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public int getAntaldøre() {
        return antaldøre;
    }

    public void setAntaldøre(int antaldøre) {
        this.antaldøre = antaldøre;
    }

    public Bil(String regNr, String mærke, String model, int årgang, int antaldøre) {
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antaldøre = antaldøre;
    }
    public abstract double beregnGrønEjerAfgift();


    public String toString() {
        return "Regnr: "+regNr+" Mærke: "+mærke+" Model: "+model+" Årgang: "+årgang+" Antal døre: "+antaldøre;
    }

}
