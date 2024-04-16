public class Main {
    public static void main(String[] args) {
        BenzinBil bil = new BenzinBil("TE1940", "Honda", "Civic", 1998, 5, 95, 25);
        DieselBil dieBil = new DieselBil("BJ1204", "Volvo", "Touran", 1972, 5, false, 27);
        Elbil elBil = new Elbil("IK9034", "Tesla", "Model X", 2014, 5, 720, 240,24 );

        Garage myGarage = new Garage();
        myGarage.addCarToList(bil);
        myGarage.addCarToList(dieBil);
        myGarage.addCarToList(elBil);

        System.out.println(myGarage);
        System.out.println("Grønejerafgift for Bilparken: "+myGarage.BeregnGrønAfgiftForBilParken());


    }
}
