public class BenzinBil extends Bil{
    private int oktanTal;
    private int kmPrL;

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public BenzinBil(String regNr, String mærke, String model, int årgang, int antaldøre, int oktanTal, int kmPrL) {
        super(regNr, mærke, model, årgang, antaldøre);
        this.kmPrL = kmPrL;
        this.oktanTal = oktanTal;
    }

    @Override
    public double beregnGrønEjerAfgift() {
       int result = 0;
        if(kmPrL > 20 && kmPrL <50) {
           result = 330;
       } else if(kmPrL > 15 && kmPrL <20) {
            result = 1050;
        } else if(kmPrL > 10 && kmPrL <15) {
            result = 2340;
        } else if (kmPrL > 5 && kmPrL<10) {
            result = 5500;
        } else {
            result = 10470;
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + " Km pr. Liter: "+kmPrL +" Oktantal: "+oktanTal;
    }
}
