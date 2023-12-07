import java.util.Scanner;
import java.time.LocalDate;

public class Persoana {
    private String nume;
    private String cnp;

    public Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getCNP() {
        return cnp;
    }

    public int getVarsta() {
        int anNastere = Integer.parseInt(cnp.substring(1, 3));//extrage primele 2 cifre din CNP
        int anCurent = LocalDate.now().getYear() % 100;//extrage ultimele 2 cifre ale anului curent
        return anCurent - anNastere;//se calculeaza varsta
    }

    public String toString() {
        return nume + ", " + cnp + ", varsta: " + getVarsta();
    }
}
