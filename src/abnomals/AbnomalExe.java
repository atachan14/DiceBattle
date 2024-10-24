package abnomals;

public class AbnomalExe {
	Obstructioned obstruction;
	Precisioned precision;

	public void allCountDown() {
		countDown(obstruction);
		countDown(precision);
	}

	public void countDown(Abnomal abnomal) {
		if (abnomal.turn > 1) {
			abnomal.sickMesse();
			abnomal.turn--;
		}
		if (abnomal.turn == 1) {
			abnomal.curedMesse();
			abnomal.turn--;
		}
	}
}
