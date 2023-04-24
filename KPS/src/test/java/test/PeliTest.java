package test;

import org.junit.*;
import static org.junit.Assert.*;
import kivipaperisaksetkorjattu.*;

public class PeliTest {

    @Test
    public void testPelaajaVoitonKasvatus() {
        Pelaaja pelaaja = new Pelaaja();
        assertEquals(0, pelaaja.getVoitot());
        pelaaja.kasvataVoittoja();
        assertEquals(1, pelaaja.getVoitot());
        pelaaja.kasvataVoittoja();
        assertEquals(2, pelaaja.getVoitot());
    }
}