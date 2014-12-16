//klasa Student koja ima samo jedan atribut, ime i prezime studenta, te standardne metode
public class Student {
private String imePrezime;

/**
 * konstruktor metod za klasu Student
 * @param imePrezime string kojim postavljamo vrijednost za atribut imePrezime prilikom instanciranja 
 */
public Student(String imePrezime ){
	this.imePrezime=imePrezime;
}

public String getImePrezime(){
	return imePrezime;
}

public void setImePrezime(String novoImePrezime){
	imePrezime=novoImePrezime;
	}

	/**
	 * metoda koja kreira i vraca string reprezentaciju objekta klase Student
	 */
	public String toString(){
		String studentToString="";
		studentToString+=imePrezime;
		//studentToString+="Ime i prezime studenta: "+imePrezime;
		return studentToString;
	}
}

