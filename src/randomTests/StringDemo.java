// StringDemo.java

package randomTests;

public class StringDemo {

    public static void main(String args[]){
        String palindrome = "Dot saw I was Tod";
        System.out.println("Length of string is: " + palindrome.length() );
        
        print( palindrome.charAt(2) );
        print( palindrome.compareTo("A") );
        print( palindrome.equalsIgnoreCase("Dot saw I") );
    }

    public static void print(Object a){
        System.out.println(a.toString());
    }
}
