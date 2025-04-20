import java.util.*;

class Automobil {
    String marka, model;
    int brzina;

    public Automobil(String marka, String model, int brzina) {
        this.marka = marka;
        this.model = model;
        this.brzina = brzina;
    }

    public void prikaziInformacije() {
        System.out.print("\nMarka: " + marka);
        System.out.print("\nModel: " + model);
        System.out.print("\nBrzina: " + brzina);
    }

    @Override
    public String toString() {
        return "Marka: " + marka + "\nModel: " + model + "\nBrzina: " + brzina;
    }

}

class PorodicniAutomobil extends Automobil {
    int broj_sjedista;
    String tip;

    public PorodicniAutomobil(String marka, String model, int brzina, String tip, int broj_sjedista) {
        super(marka, model, brzina);
        this.tip = tip;
        this.broj_sjedista = broj_sjedista;
    }

    public void prikaziInformacije() {
        super.prikaziInformacije();
        System.out.print("\nTip: " + tip);
        System.out.print("\nBroj sjedista: " + broj_sjedista);
    }
}

class SportskiAutomobil extends Automobil {
    String tip_motora;
    int max_brzina;

    public SportskiAutomobil(String marka, String model, int brzina, int max_brzina, String tip_motora) {
        super(marka, model, brzina);
        this.tip_motora = tip_motora;
        this.max_brzina = max_brzina;
    }

    public void prikaziInformacije() {
        super.prikaziInformacije();
        System.out.print("\nTip motora: " + tip_motora);
        System.out.print("\nMaksimalna brzina: " + max_brzina);
    }
}

public class Main {
    public static void main(String[] args) {
        PorodicniAutomobil pa = new PorodicniAutomobil("Porsche", "Cayenne", 5, "tip1", 5);
        SportskiAutomobil sa = new SportskiAutomobil("Mclaren", "P1", 7, 250, "V12");

        pa.prikaziInformacije();
        System.out.print("\n");
        sa.prikaziInformacije();
    }
}