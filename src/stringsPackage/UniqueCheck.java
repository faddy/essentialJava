package stringsPackage;

public class UniqueCheck {

    public static void main(String[] args){
        char[] arr = {'a','b','c'};
        System.out.println( uniqueCheck(arr) );
    }

    public static boolean uniqueCheck(char[] arr){
        int len = arr.length;
        for (int i=0; i<len; i++){
            for (int j=i+1; j<len; j++) {
                if (arr[i]==arr[j]) return false;
            }
        }
        return true;
    }

}
