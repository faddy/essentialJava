package randomTests;

import java.io.*;
import java.util.Arrays;
import java.util.Date;

public class EmployeeTest {

    public static void main(String[] args) {
        System.out.println("we will be successful!");

        Employee emp1 = new SubEmployee("Gfaddy");
        System.out.println( emp1 instanceof Employee);
        
        int[] numbers = {10, 20, 30, 40};
        Employee[] empArray = new Employee[4];

        for (int x : numbers) {
            Employee emp = new Employee("Employee " + Integer.toString(x));
            emp.salary = x*10000;
            empArray[ x/10 -1 ] = emp;
        }

        double total = 0;
        for (Employee emp : empArray){
            emp.printDetails();
            total += emp.salary;
        }
        System.out.println(total);

        Date date = new Date();
        System.out.println(date);
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);

        findMax(22, 30, 20, 22, 70, 45);
        findMax(new double[] {22, 30, 20, 22, 70, 45});
        
        try {
            testException();
        } catch (SampleException e){
    	    System.err.append("Whatever");
        } catch (Exception e) {
        	System.err.append(", yo!");
        } finally {
        	System.err.append(", bro!");
        }
    }
    
    public static void findMax(double... numbers){
    	
        if (numbers.length == 0){
            System.out.println("No arguments passed");
            return;
        }

        double result = numbers[0];
        for (double x : numbers){
            if (x > result) result = x;
        }

        System.out.println("\nMax is: " + result);

    }
    
    public static void printChar(Character ch){
    	System.out.println(ch.toString());
        System.out.println("isLetter? "+ Character.isLetter(ch) );
        System.out.println("isDigit? "+ Character.isDigit(ch) );
        System.out.println("isWhieSpace? " + Character.isWhitespace(ch) );
        System.out.println("toUpperCase: "+ Character.toUpperCase(ch) );
    }
    
    public static void testException () throws SampleException {
    	
    	SampleException se = new SampleException();
    	throw se;
    }
}
