// file input stream demo

package randomTests;

import java.io.*;

public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException{
        File f = new File("/home/fahad/latestthings.txt");
        InputStream inStream = null;
        try {
            inStream = new FileInputStream(f);
            System.out.println(inStream.read());
        } catch (Exception e){
            System.out.println("something went wrong, bro");
        } finally {
            if (inStream != null) {
                inStream.close();
            }
        }
    }
}
