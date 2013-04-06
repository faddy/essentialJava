package stringsPackage;

/*
 * Remove duplicate characteres from a string
 * */
public class RemoveDuplicates {
	
	public static void main (String[] args){
		
		//char[] arr = args[0].toCharArray();
		char[] arr = {'a','b','c','a','e','f','b','b','d','g'};
		
		for (char ch : arr) {
			if (ch == '\0') ch='x';
			System.out.print(ch + " ");
		}
		System.out.println();
		
		removeDuplicates(arr);

		for (char ch : arr) {
			if (ch == '\0') ch='x';
			System.out.print(ch + " ");
		}
		
	}
	
	public static void removeDuplicates(char[] arr){

		for (int i=0; i<arr.length-1; i++){
			
			if (arr[i] == '\0') continue;
			
			for (int j=i+1; j<arr.length; j++){
				if ( arr[i] == arr[j] ) {
					arr[j] = '\0';
				}
			}
		}
		
		reorderArr(arr);
		
	}
	
	public static void reorderArr(char[] arr){
		int to=0;		
		while (to<arr.length){
			if (arr[to] == '\0') break;
			else to++;
		}
		
		int from = to+1;
		while (from < arr.length){
			if (arr[from] == '\0') {
				from++;
			}
			else {
				arr[to] = arr[from];
				to++; from++;
			}
		}
		
		while(to < arr.length) {
			arr[to] = '\0';
			to++;
		}
	}

}
