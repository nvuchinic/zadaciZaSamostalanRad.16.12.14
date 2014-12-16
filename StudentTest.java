
public class StudentTest {
public static void main(String[] args) {
	Razred razred1=new Razred();
	razred1.studenti[0][0]=new Student("Adnan Spahic");
	razred1.studenti[0][1]=new Student("Davor Stankovic");
	razred1.studenti[0][2]=new Student("Amra Poprzanovic");
	razred1.studenti[0][3]=new Student("Edib Imamovic");
	razred1.studenti[1][0]=new Student("Emina Muratovic");
	razred1.studenti[1][1]=new Student("Emir Imamovic");
	razred1.studenti[1][2]=new Student("Gordan Sajevic");
	razred1.studenti[1][3]=new Student("Gorjan Kalauzovic");
	razred1.studenti[2][0]=new Student("Haris Arifovic");
	razred1.studenti[2][1]=new Student("Haris Krkalic");
	razred1.studenti[2][2]=new Student("Hikmet Durgutovic");
	razred1.studenti[2][3]=new Student("Jesenko Gavric");
	razred1.studenti[3][0]=new Student("Mirza Becic");
	razred1.studenti[3][1]=new Student("Mustafa Ademovic");
	razred1.studenti[3][2]=new Student("Nedim Omerovic");
	razred1.studenti[3][3]=new Student("Nedzad Hamzic");
	razred1.studenti[4][0]=new Student("Neldin Dzekovic");
	razred1.studenti[4][1]=new Student("Nermin Graca");
	razred1.studenti[4][2]=new Student("Nermin Vucinic");
	razred1.studenti[4][3]=new Student("Sanela Grcic");
	razred1.studenti[5][0]=new Student("Selma Tabakovic");
	razred1.studenti[5][1]=new Student("Vedad Zornic");
	razred1.studenti[5][2]=new Student(" ");
	razred1.studenti[5][3]=new Student(" ");

	System.out.println(razred1.toString());
	System.out.println("\n\nRandom student: ");
	System.out.println(razred1.getRandomStudent().toString());
}
}
