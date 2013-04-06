package inheritanceTests;

public class Person {

	private static int totalPersons;
	
	private int zprivate;
	public int xpublic;
	protected int yprotected;

	
	private Person(int x, int y, int z){
		totalPersons ++;
		this.xpublic = x;
		this.yprotected = y;
		this.zprivate = z;
	}
	
	public static int getTotalPersons(){
		return totalPersons;
	}
	
	public static Person createObject(int x, int y, int z) throws Exception {
		if (totalPersons == 3){
			throw new Exception("Too many persons already in the system");
		}
		return new Person(x,y,z);
	}
	
	public void printMe(){
		System.out.println("totalMainFactoryObjects = " + totalPersons);
		System.out.println("xpublic: " + this.xpublic);
		System.out.println("yprotected: " + this.yprotected);
		System.out.println("zprivate: " + this.zprivate);
	}

}
