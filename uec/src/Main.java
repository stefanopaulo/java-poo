
public class Main {

	public static void main(String[] args) {
		// Fighter[] f = new Fighter[5];
		Fighter f[] = new Fighter[6];
		
		
		f[0] = new Fighter("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
		f[1] = new Fighter("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		f[2] = new Fighter("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		f[3] = new Fighter("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		f[4] = new Fighter("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		f[5] = new Fighter("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

		/*for (int i = 0; i < f.length; i++) {
			f[i].toPresent();
			f[i].status();
		}*/

		Fight uec001 = new Fight();
		
		uec001.markFight(f[0], f[1]);
		uec001.fight();
		
		f[0].status();
		f[1].status();
	}

}
