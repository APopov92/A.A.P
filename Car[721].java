public class Car {
	private String merk;
	public int aantalVersnellingen;
	public boolean knipperlichtAan;
	public short snelheid;
	public char eersteLetterVanNummerbord;

	//Constructor

	public void ditIsMienMerk() {
		System.out.println("Jouw merk is " + merk);
	}

	public String getMerk() {
		return merk;
	}

	public int getAantalVersnellingen() {
		return aantalVersnellingen;
	}

	public boolean getKnipperlichtAan() {
		return knipperlichtAan;
	}

	public short getSnelheid() {
		return snelheid;
	}

	public char geteersteLetterVanNummerbord() {
		return eersteLetterVanNummerbord;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}	

	public void setAantalVersnellingen(int aantalVersnellingen) {
		this.aantalVersnellingen = aantalVersnellingen;
	}

	public void setSnelheid(short snelheid) {
		this.snelheid = supersnel;
	}
}
































/*

fields, dus class variables (properties) zoals merk en type hierboven bijvoorbeeldworden automatisch geinitialiseerd terwijl "normale" 
variables wel altijd van een waarde voorzien moeten worden voordat je ze gaat gebruiken.

default krijgen deze fields per type de volgende waarde:
byte, short, int, long -> 0
float, double -> 0.0
boolean -> false
char -> \u0000
Class/Objects -> null

*/

