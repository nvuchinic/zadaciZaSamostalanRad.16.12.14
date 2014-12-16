/*klasa Razred koja se sastoji od niza objekata tipa Student, 
 * metode getRandomStudent te drugih  standardnih metoda
 */
public class Razred {
Student[][] studenti;


/*konstruktor metod za ovu klasu, prilikom instanciranja pravi se
 *  dvodimenzionalni niz od objekata tipa Student velicine 24
 */
public Razred(){
	this.studenti=new Student[6][4];

}

/*standardni metod koji kreira i vraca string reprezentaciju objekta klase Razred*/
public String toString(){
	String razredToString="";
	for(int i=0;i<6;i++){
		for(int j=0;j<4;j++){
			if(studenti[i][j].toString().equals(" "))
				razredToString+="(               )";
			else
			razredToString+="("+studenti[i][j].toString()+") ";
			if(j==1)
				razredToString+="             ";
		}
		razredToString=razredToString+"\n\n\n";
	}
	return razredToString;
}

/*metod koji vraca random objekt tipa Student iz 2D niza objekata tipa Student,
 *  a koji predstavlja polje u klasi Razred
 */
public Student getRandomStudent(){
	int indRed=0 + (int)(Math.random() * ((5 - 0) + 0));
	int indKol=0 + (int)(Math.random() * (( 3- 0) + 0));
	Student randomStudent=studenti[indRed][indKol];
	return randomStudent;
}

}
