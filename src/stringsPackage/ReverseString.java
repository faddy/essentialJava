package stringsPackage;

public class ReverseString {

    public static void main(String[] args){
        for (String item : args) System.out.println(item);

        String toReplace = args[0];
        char[] arr = toReplace.toCharArray();
        System.out.println(arr);
        //char[] arr = {'a', 'b', 'c', 'd', '\0'};
        reverse(arr);
        System.out.println(arr);
    }

    public static void reverse(char[] arr){
        int falseLen = arr.length;
        for (int i=0; i< (falseLen/2); i++){
            swap(arr, i, falseLen-i-1);
        }
    }

    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
