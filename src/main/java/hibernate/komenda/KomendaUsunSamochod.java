package hibernate.komenda;

import hibernate.database.DataAccessObject;
import hibernate.model_wypozyczenia.Samochod;


public class KomendaUsunSamochod implements Komenda{
    private DataAccessObject<Samochod> dataAccessObject;

    public KomendaUsunSamochod(){
        this.dataAccessObject = new DataAccessObject<>();}


    @Override
    public String getKomenda() {
        return "usun pojazd";
    }

    @Override
    public void obsluga() {
        System.out.println("Podaj id usuwanego pojazdu");
        String idString = Komenda.scanner.nextLine();
        Long id = Long.parseLong(idString);


            if (dataAccessObject.delete(Samochod.class, id)) {
                System.out.println("Usunięto pojazd");
            }else {
                System.err.println("Nie znaleziono pojazdu w bazie");
            }



    }
}
