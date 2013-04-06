// Buffered Reader Demo

package randomTests;

import java.io.*;

public class BRRead {

    public static void main(String[] args) {
        
    	Number n = 10;
    	Number m = 23;
    	System.out.println( n.floatValue() < m.floatValue() );
    	
        boolean value = false;
        if (!value)
        	try {
        		System.out.println("What in the flying fuck");
        	} 
        	catch (Exception e){
        		
        	}
    }
    
    public static void testBufferedReader() throws IOException{
    	BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		System.out.println("Enter characters, 'q' to quit");
		char c;
		do {
		    c = (char) br.read();
		    System.out.println(c);
		} while (c != 'q');
		
		String input;
		do {
			input = br.readLine();
			System.out.println(input);
		} while ( !input.equals("end") );

    }

}
