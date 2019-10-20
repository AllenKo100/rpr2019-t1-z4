package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa1 = new Korpa();

        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "1"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "2"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "3"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "4"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "5"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "6"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "7"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "8"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "9"));

        assertEquals(true, korpa1.dodajArtikl(new Artikl("Biciklo", 100, "10")));

    }

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa1 = new Korpa();

        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "1"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "2"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "3"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "4"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "5"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "6"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "7"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "8"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "9"));

        int brElemenata=korpa1.getBrojElemenata();
        Artikl artikal1=korpa1.izbaciArtiklSaKodom("5");
        int brElemenataPoslije=korpa1.getBrojElemenata();
        assertEquals(brElemenata-1, brElemenataPoslije);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa1 = new Korpa();

        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "1"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "2"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "3"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "4"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "5"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "6"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "7"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "8"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 100, "9"));

        int ukupnaCijena=9*100;

        assertEquals(ukupnaCijena, korpa1.dajUkupnuCijenuArtikala());
    }
}