import java.util.Scanner;

public class OOPApplicatie {

	public static void main(String[] args) {
	
	Car myCar = new Car();

	Scanner myScanner = new Scanner(System.in);


	System.out.println("welk merk auto heb jij?");
	myCar.merk = myScanner.next();

	System.out.println("Hoeveel versnellingen heeft jouw " + myCar.merk + "?");
	myCar.aantalVersnellingen = myScanner.nextInt();

	//System.out.println("Staat jouw knipperlicht aan?");
	//myCar.knipperlichtAan = myScanner.nextBoolean();

	System.out.println("Hoe hard gaat ie?");
	myCar.snelheid = myScanner.nextShort();

	System.out.println("Met welke letter begint jouw nummerplaat?");
	myCar.nummerplaatVersie = myScanner.nextLine();


	}
}