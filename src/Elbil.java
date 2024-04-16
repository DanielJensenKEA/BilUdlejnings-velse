public class Elbil extends Bil {
    private int batteriKapacitetKWh;
    private int maxKm;
    private int whPrKm;

    public Elbil(String regNr, String mærke, String model, int årgang, int antaldøre
    ,int batteriKapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antaldøre);
        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public void setBatteriKapacitetKWh(int batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }
    @Override
    public double beregnGrønEjerAfgift() {
        int result = 0;
        double convertkmPrl = (whPrKm/91.25)/100;
        if(convertkmPrl > 20 && convertkmPrl <50) {
            result = 330;
        } else if(convertkmPrl > 15 && convertkmPrl <20) {
            result = 1050;
        } else if(convertkmPrl > 10 && convertkmPrl <15) {
            result = 2340;
        } else if (convertkmPrl > 5 && convertkmPrl<10) {
            result = 5500;
        } else {
            result = 10470;
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString()+" Batterikapacitet KWh: "+batteriKapacitetKWh+" Max Km: "+maxKm+" whPr Km: "+whPrKm;
    }
}
