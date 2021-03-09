
public class Nicole_Zinseszinsen {
	public static void main(String[] args) {
		float guthaben = 20000.00F, zins = 1.03F;
		float[] floatArray = new float[10];
		
		for(int i = 0; i < floatArray.length; i++) {
			float guthabenFolgejahr = guthaben*zins;
			floatArray[i] = guthabenFolgejahr;
			guthaben = guthabenFolgejahr;
		}
		System.out.println(floatArray[9]);
	}	
}
