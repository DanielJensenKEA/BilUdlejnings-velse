public class DieselBil extends Bil{
    private boolean harPartikelFilter;
    private int kmPrL;

    public boolean isHarPartikelFilter() {
        return harPartikelFilter;
    }

    public void setHarPartikelFilter(boolean harPartikelFilter) {
        this.harPartikelFilter = harPartikelFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public DieselBil(String regNr, String mærke, String model, int årgang, int antaldøre, boolean harPartikelFilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antaldøre);
        this.harPartikelFilter = harPartikelFilter;
        this.kmPrL = kmPrL;
    }
    @Override
    public double beregnGrønEjerAfgift() {
        double result = 0;
        int udligning = 0;
        double partAfgift = 0;
        if(kmPrL > 20 && kmPrL <50) {
            result = 330;
            udligning = 130;
        } else if(kmPrL > 15 && kmPrL <20) {
            result = 1050;
            udligning = 1390;
        } else if(kmPrL > 10 && kmPrL <15) {
            result = 2340;
            udligning = 1850;
        } else if (kmPrL > 5 && kmPrL<10) {
            result = 5500;
            udligning = 2770;
        } else {
            result = 10470;
            udligning = 15260;
        }
        if(!harPartikelFilter) {
            partAfgift = 1000;
        }
        else {
            partAfgift = 0;
        }
        return result+udligning+partAfgift;
    }

    @Override
    public String toString() {
        String result="";
        if(harPartikelFilter == true) {
            result += "Partikel filter: " + "Ja";
        } else {
            result += "Partikel filter: "+"Nej";
        }
        result += " Km pr. Liter: "+kmPrL;
        return super.toString()+result;
    }
}
