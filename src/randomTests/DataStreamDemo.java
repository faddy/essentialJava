// Data stream demo

package randomTests;

import java.io.*;


public class DataStreamDemo {

    public static void main(String[] args) throws Exception {

        DataInputStream inStream = new DataInputStream(
                                       new FileInputStream("/home/fahad/newblog") );
        
        
        
//        DataOutputStream outStream = new DataOutputStream(
//                                         new FileOutputStream("/home/fahad/newblog_copy") );

//        int len = inStream.available();
//        byte ch;
//        for (int i = 0; i<len; i++){
//        	ch = inStream.readByte();
//        	System.out.println((char) ch);
//        }

        inStream.close();


    }
}
