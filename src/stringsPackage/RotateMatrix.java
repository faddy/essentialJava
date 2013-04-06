package stringsPackage;

public class RotateMatrix {

	public static void main(String[] args){
		
		int N = 4;
		int[][] arr = {
				{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}
				};
		
		int M = 2;
		int[][] arr2 = { {1,2}, {5,6} };
		
		printArray(arr, N);
		System.out.println("------");
		rotateArray(arr, N);
		System.out.println("------");
		printArray(arr, N);
	}
	
	public static void printArray(int[][] arr, int N){
		for (int i=0; i<N; i++){
			for (int j=0; j<N; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void rotateArray(int[][] arr, int N){
		for(int layer=0; layer<=N/2; layer++){
			System.out.println("layer: " + layer);
			int first = layer;
			int last = N-layer-1;
			System.out.println("first: " + first + ", last: " + last);
			
			for (int i=first; i<last; i++){
				
				int offset = i - first;
				int temp = arr[first][i];
				arr[first][i] = arr[last-offset][first];
				arr[last-offset][first] = arr[last][last-offset];
				arr[last][last-offset] = arr[i][last];
				arr[i][last] = temp;
				
//				int temp = arr[first][i];
//				arr[first][i] = arr[i][last];
//				arr[i][last] = arr[last][last - i];
//				arr[last][last - i] = arr[last - i][first];
//				arr[last - i][first] = temp;
			}
			
		}
		
	}
}
