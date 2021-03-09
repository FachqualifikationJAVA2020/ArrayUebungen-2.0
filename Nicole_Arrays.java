
public class Nicole_Arrays {
	public static void main(String[] args) {
		int [] ganzZahl = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		float [] kommaZahl = new float[10];
		
		for(int i = 0; i < ganzZahl.length; i++) {
			kommaZahl[i] = ganzZahl[i];
			System.out.println(kommaZahl[i]);
		}
	}
}
