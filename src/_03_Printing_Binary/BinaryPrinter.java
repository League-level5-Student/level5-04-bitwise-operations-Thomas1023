package _03_Printing_Binary;

public class BinaryPrinter{
	//Complete the methods below so they print the passed in parameter in binary.
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		byte i=113;
		
		BinaryPrinter BP = new BinaryPrinter();
		BP.printByteBinary(i);
	}
	public void printByteBinary(byte b) {
		
		System.out.println(Integer.toString(Byte.toUnsignedInt(b),2));
	}
	
	public void printShortBinary(short s) {
		System.out.println(Integer.toString(Short.toUnsignedInt(s),2));
	}
	
	public void printIntBinary(int i) {
		System.out.println(Integer.toString(i,2));
	}
	
	public void printLongBinary(long l) {
		
	}
}
