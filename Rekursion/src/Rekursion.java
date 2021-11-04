
public class Rekursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("iterative Summenfunktion: "+ iterativeSumme(6));
		System.out.println("rekursive Summenfunktion: "+ rekursiveSumme(6));
		System.out.println("iterative Hoch-Funktion: "+ iterativeHoch(2,3));
		System.out.println("rekursive Hoch-Funktion: "+ rekursiveHoch(2,3));

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
	
	
}
