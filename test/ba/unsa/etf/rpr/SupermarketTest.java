package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket supermarket1 = new Supermarket();

        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "1"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "2"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "3"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "4"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "5"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "6"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "7"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "8"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "9"));

        assertEquals(true, supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "10")));
    }

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket1 = new Supermarket();

        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "1"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "2"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "3"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "4"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "5"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "6"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "7"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "8"));
        supermarket1.dodajArtikl(new Artikl("Sarafciger", 10, "9"));

        int brElemenata=supermarket1.getBrojElemenata();
        Artikl artikal1=supermarket1.izbaciArtiklSaKodom("5");
        int brElemenataPoslije=supermarket1.getBrojElemenata();
        assertEquals(brElemenata-1, brElemenataPoslije);
    }
}