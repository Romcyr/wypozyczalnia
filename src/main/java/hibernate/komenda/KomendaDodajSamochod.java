package hibernate.komenda;

import hibernate.database.DataAccessObject;
import hibernate.model_wypozyczenia.Samochod;


public class KomendaDodajSamochod implements Komenda {

    public KomendaDodajSamochod() {

        this.dataAccessObject = new DataAccessObject<>();
    }

    private DataAccessObject<Samochod> dataAccessObject;



    @Override
    public String getKomenda(){
        return "dodaj pojazd";
    }

    @Override
    public void obsluga(){
        System.out.println("Podaj markę pojazdu");
        String marka = Komenda.scanner.nextLine();

        System.out.println("Podaj model pojazdu");
        String model = Komenda.scanner.nextLine();

        System.out.println("Podaj vin pojazdu");
        String vin = Komenda.scanner.nextLine();

        System.out.println("Podaj nr rejestracyjny pojazdu");
        String nrRej = Komenda.scanner.nextLine();

        Samochod samochod= Samochod.builder()
                .marka(marka)
                .model(model)
                .nrRej(nrRej)
                .vin(vin)
                .build();

        dataAccessObject.insert(samochod);

    }
}
