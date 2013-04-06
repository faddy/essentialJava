// file stream demo

package randomTests;

import java.io.*;

public class FileStreamDemo {

    public static void main(String[] args) throws IOException {
    	
    	// open an existing file [check for exception]
    	File f = new File("/home/fahad");
    	if ( f.isDirectory() ){
    		System.out.println("The file " + f.getAbsolutePath() + " is a directory");
    		System.out.println( f.list() );
    		String[] s = f.list();
    		for (String str : s){
    			System.out.println(str);
    		}
    	}
    	
/*
    	InputStream inStream = new FileInputStream("/home/fahad/latest_things.txt");
    	
    	// open a new output file stream
    	OutputStream outStream = new FileOutputStream("/home/fahad/latest_things_copy.txt");
    	
    	// write the contents of the input file into the new output file stream
    	System.out.println(inStream.available() );
    	String str = "";
    	int ch;
    	do {
    		ch = inStream.read();
    		outStream.write(ch);
    		str = str + (char) ch;
    	} while ( ch != -1 );

    	System.out.println(str);
    	
    	inStream.close();
    	outStream.close();
*/    	

    }
}
