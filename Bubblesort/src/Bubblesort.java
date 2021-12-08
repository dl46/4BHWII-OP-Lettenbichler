import java.util.Random;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = makeArray(500);
		int[] sortiert = bubbleSort(arr);
		
		for(int i : sortiert) {
			System.out.println(i);
		}
	}
	
	public static int[] bubbleSort(int[] arr) {
		int a;
        for(int i = 1; i <arr.length; i++){
            for(int j = 0; j < arr.length-i; j++){
                if(arr[j]> arr[j+1]){
                    a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=a;
                }
            }
        }

        return arr;
	}
	
	public static int[] makeArray(int n){
        int[] arr = new int[n];
        Random r = new Random();
        for(int i = 0; i < arr.length; i++) {
            int random = r.nextInt(n-1);
            arr[i]=random;
        }
        return arr;
	}

}
