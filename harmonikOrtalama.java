public class Main {
	public static void main(String[] args) {
    
		double[] arr = { 2,4,7,8,6 };
		double harmonic = 0;
		for (int i = 0; i < arr.length; i++) {
			harmonic = harmonic+ (1 / arr[i]);
		} 
		System.out.println(harmonic);
		double harmonicAverage = (arr.length) / (harmonic);
		System.out.println(harmonicAverage);
	}
} 
