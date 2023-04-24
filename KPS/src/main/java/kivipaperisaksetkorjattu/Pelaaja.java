package kivipaperisaksetkorjattu;

import java.util.Random;

/**
 * Luokka pelaajaa varten.
 * Pelaajalla on voittoja, ja han voi valita kiven, paperin tai sakset.
 */
public class Pelaaja {

    int voitot;
    private final String[] valinnat = {"kivi", "paperi", "sakset"};
    private final Random random;

    /**
     * Konstruktori luo uuden pelaajan.
     */
    public Pelaaja() {
        this.voitot = 0;
        this.random = new Random();
    }

    /**
     * Metodi palauttaa pelaajan valinnan kiven, paperin tai sakset.
     *
     * @return pelaajan valinta
     */
    public String valitse() {
        return this.valinnat[random.nextInt(valinnat.length)];
    }

    /**
     * Metodi kasvattaa pelaajan voittojen lukumaaraa yhdella.
     *
     * @return pelaajan voittojen yhteismaara
     */
    public int kasvataVoittoja() {
        return ++this.voitot;
    }

    /**
     * Metodi palauttaa pelaajan voittojen lukumaaran.
     *
     * @return pelaajan voittojen lukumaara
     */
    public int getVoitot() {
        return this.voitot;
    }
}