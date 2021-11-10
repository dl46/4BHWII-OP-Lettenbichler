
public class Rekursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("iterative Summenfunktion: "+ iterativeSumme(6));
		System.out.println("iterative Hoch-Funktion: "+ iterativeHoch(2,3));

		long start1 = System.nanoTime();
		System.out.println("rekursive Summenfunktion: "+ rekursiveSumme(6));
		long time1 = System.nanoTime() - start1;
		System.out.println("Zeit: " + time1 + " nanosekunden");
		
		long start2 = System.nanoTime();
		System.out.println("rekursive Hoch-Funktion: "+ rekursiveHoch(2,3));
		long time2 = System.nanoTime() - start2;
		System.out.println("Zeit: " + time2 + " nanosekunden");

		long start3 = System.nanoTime();
		System.out.println("endrekursive Summenfunktion: "+ endrekursiveSumme(0,6));
		long time3 = System.nanoTime() - start3;
		System.out.println("Zeit: " + time3 + " nanosekunden");

		long start4 = System.nanoTime();
		System.out.println("endrekursive Hoch-Funktion: "+ endrekursiveHoch(1,2,3));
		long time4 = System.nanoTime() - start4;
		System.out.println("Zeit: " + time4 + " nanosekunden");
	}
	
	public static int iterativeSumme(int anz) {
		int res = 0;
		for(int i = 0; i < anz; i++) {
			res +=1;
		}
		return res;
	}
	
	public static int rekursiveSumme(int anz) {
		if(anz == 1) {
			return 1;
		}
		return anz + rekursiveSumme(anz -1);
	}
	
	public static int endrekursiveSumme(int erg, int anz) {
		if(anz == 1) {
			return erg;
		}
		return endrekursiveSumme(erg + anz, anz-1);
	}
	
	public static int iterativeHoch(int a, int b) {
		int res = a;
		for(int i = 0; i < b; i++) {
			res *= a;
		}
		return res;
	}

	public static int rekursiveHoch(int a, int b) {
		if(b == 0) {
			return 1;
		}
		return a * rekursiveHoch(a, b-1);
	}
	
	public static int endrekursiveHoch(int erg, int a, int b) {
		if(b == 0) {
			return erg;
		}
		return endrekursiveHoch(erg*a, a,  b-1);
	}
	
	
	
}
