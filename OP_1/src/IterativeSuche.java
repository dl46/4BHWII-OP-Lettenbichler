
public class IterativeSuche {
	
	//verändert
	
	private static int zaehler = 0;
	private static int zaehler2 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		boolean ergebnis = iterativ(8, arr);
		System.out.println("iterativ: " + zaehler);
		
		ergebnis = binaer(8, arr);
		System.out.println("binaer: " + zaehler2);
		
	}
	
	public static boolean iterativ(int x, int[] arr) {
		zaehler = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return true;
			}
			zaehler ++;
			
		}
		return false;
	}
	
	public static boolean binaer(int x, int[] arr) {
		zaehler2 = 0;
		int first = 0;
		int last = arr.length -1;
		
		while(first <= last) {
			zaehler2 ++;
			
			int middle = (first + last)/2;
			if(arr[middle] == x) {
				return true;
			}
		
			if(arr[middle] < x) {
				first = middle +1;
			}else {
				last = middle-1;
			}
		}
		return false;
	}

}
