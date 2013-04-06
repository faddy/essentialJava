package randomTests;

class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE};
    FreshJuiceSize size;
    int bitVariable;

    public FreshJuice(int bitV){
        bitVariable = bitV;
    }
}

public class FreshJuiceTest {

    public static void main (String[] args){
	System.out.println("never give up");
	
	FreshJuice juice1 = new FreshJuice(1);
	FreshJuice juice2 = new FreshJuice(2);

        int result = juice1.bitVariable ^ juice2.bitVariable;
        System.out.println("result is: " + result);
    }
}
