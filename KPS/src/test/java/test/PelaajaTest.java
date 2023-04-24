package test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import kivipaperisaksetkorjattu.*;

public class PelaajaTest {

    private Pelaaja pelaaja;

    @Before
    public void setUp() {
        pelaaja = new Pelaaja();
    }

    @Test
    public void testValitse() {
        String valinta = pelaaja.valitse();
        assertTrue(valinta.equals("kivi") || valinta.equals("paperi") || valinta.equals("sakset"));
    }

    @Test
    public void testKasvataVoittoja() {
        int voitot = pelaaja.kasvataVoittoja();
        assertTrue(voitot == 1);
        assertTrue(pelaaja.getVoitot() == 1);
    }
}