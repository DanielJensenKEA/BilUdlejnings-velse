import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> bilListe = new ArrayList<>();

    public void addCarToList(Bil bil) {
        bilListe.add(bil);
    }

    public double BeregnGrønAfgiftForBilParken() {
        double result = 0;

        for(Bil bil:bilListe) {
            result += bil.beregnGrønEjerAfgift();
        }
        return result;

    }

    @Override
    public String toString() {
        String result ="";
        String errorGar ="No cars were found parked in the Garage.";
        int count = 0;
        if(!bilListe.isEmpty()) {
            for(Bil bil :bilListe) {
                result += "\n"+count+": "+bil.getRegNr()+" "+bil.getMærke()+" "+bil.getModel()+" "+bil.getÅrgang()+" "+bil.getAntaldøre();
                count++;
            }
        } else {
            return errorGar;
        }
        return result;
    }
}

