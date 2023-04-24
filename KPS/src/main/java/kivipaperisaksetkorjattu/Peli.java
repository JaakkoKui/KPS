package kivipaperisaksetkorjattu;

/**
 * Kivipaperisakset-pelin Peli-luokka, joka sisaltaa pelin paalogiikan.
 */
public class Peli {
	
	/**
	 * Paaohjelma, joka kaynnistaa pelin ja suorittaa sen paalogiikan.
	 * 
	 * @param args komentoriviparametrit (ei kaytössa tassa sovelluksessa)
	 */
	public static void main(String args[]) {
		// Alustetaan kaksi pelaajaa, pelin tilastomuuttujat seka pelin loppumisen ehto.
		Pelaaja p1 = new Pelaaja();
		Pelaaja p2 = new Pelaaja();
		int pelatutPelit = 0;
		int tasapelit = 0;
		boolean peliLoppui = false;

		// Pelin paalooppi.
		while (!peliLoppui) {
			// Kasvatetaan pelattujen pelien maaraa ja tulostetaan pelin tilastot.
			pelatutPelit++;
			System.out.println("Era: " + pelatutPelit + " =====================\n");
			System.out.println("Tasapelien lukumaara: " + tasapelit + "\n");

			// Pelaajat valitsevat siirtonsa ja tulostetaan ne ruudulle.
			String p1Valinta = p1.valitse();
			System.out.println("Pelaaja 1: " + p1Valinta);
			String p2Valinta = p2.valitse();
			System.out.println("Pelaaja 2: " + p2Valinta);

			// Tarkistetaan voittaja ja kasvatetaan voittojen maaraa.
			if (p1Valinta.equals(p2Valinta)) {
				System.out.println("Tasapeli!");
				tasapelit++;
			} else if ((p1Valinta.equals("kivi") && p2Valinta.equals("sakset"))
					|| (p1Valinta.equals("paperi") && p2Valinta.equals("kivi"))
					|| (p1Valinta.equals("sakset") && p2Valinta.equals("paperi"))) {
				System.out.println("Pelaaja 1 voittaa!");
				p1.kasvataVoittoja();
			} else {
				System.out.println("Pelaaja 2 voittaa!");
				p2.kasvataVoittoja();
			}

			// Tulostetaan pelin tilastot.
			System.out.println("Pelaaja 1:lla koossa " + p1.getVoitot() + " voittoa!");
			System.out.println("Pelaaja 2:lla koossa " + p2.getVoitot() + " voittoa! \n");
			// Tarkistetaan, onko jompikumpi pelaajista saavuttanut pelin voittovaatimuksen.
			if (p1.getVoitot() == 3 || p2.getVoitot() == 3) {
				System.out.println("Peli loppui!");
				peliLoppui = true;
			}
		}
	}
}